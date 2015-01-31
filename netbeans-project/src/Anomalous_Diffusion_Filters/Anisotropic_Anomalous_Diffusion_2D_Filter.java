package Anomalous_Diffusion_Filters;

import classes.Diffusion;
import ij.IJ;
import ij.ImagePlus;
import ij.WindowManager;
import ij.gui.GenericDialog;
import ij.plugin.PlugIn;
import classes.ImageAccess;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author antonio
 */
public class Anisotropic_Anomalous_Diffusion_2D_Filter implements PlugIn {
//TODO Aprimorar plugin para rodar com imagestack, mesmo com processamento 2D.
    
    String[] choiceItemsEdgeFunction = {"Exponential", "Fractional", "Partial"};
    Diffusion diff = new Diffusion();

    @Override
    public void run(String string) {

        //Get the image opened in the current ImageJ scene.
        ImagePlus img = WindowManager.getCurrentImage();

        if (img == null) {
            IJ.showMessage("No image open", "There is no image open\nPlease, open an image first");
            return;
        }

        //Test if the image open is not an RGB image.
        if (img.getType() == ImagePlus.COLOR_RGB) {
            IJ.showMessage("Not gray scale image", "The image open is not gray scale\nPlease, convert the image to 8-bits, 16-bits or 32 bits gray scale.");
            return;
        }

        GenericDialog gd = new GenericDialog("Anisotropic Anomalous Diffusion - 2D");
        gd.setOKLabel("Run");

        gd.addNumericField("Anomalous parameter (Q)", 1.0, 4);
        gd.addNumericField("Condutance", 5.0, 4);
        gd.addNumericField("Time step", 0.0125, 4);
        gd.addNumericField("Number of iterations", 5, 1);
        gd.addChoice("Edge function", choiceItemsEdgeFunction, choiceItemsEdgeFunction[0]);
        gd.showDialog();

        //Close diaglog if the user click on the Cancel button.
        if (gd.wasCanceled()) {
            return;
        }

        if (gd.wasOKed()) {
            diff.setQ(gd.getNextNumber());
            diff.setK(gd.getNextNumber());
            diff.setDelta(gd.getNextNumber());
            diff.setNumInteration((int) gd.getNextNumber());
            int edgeChoice = gd.getNextChoiceIndex() + 1;
            diff.AnomalousAnisoDiff(new ImageAccess(img.getProcessor()), edgeChoice).show("AAD-Q"+diff.getQ()+"numInt" + diff.getNumInteration() + "timeStep" + diff.getDelta() + "Condutance" + diff.getK());
        }

    }

}
