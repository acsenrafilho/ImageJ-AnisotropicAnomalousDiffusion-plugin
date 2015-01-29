
import ij.IJ;
import ij.ImagePlus;
import ij.WindowManager;
import ij.gui.GenericDialog;
import ij.plugin.PlugIn;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antonio
 */
public class Anomalous_Filters_ implements PlugIn{

    String[] choiceItems = {"Isotropic Anomalous", "Anisotropic Anomalous"};
    
    @Override
    public void run(String string) {
        
        ImagePlus img = WindowManager.getCurrentImage();
        
        if(img==null){
            IJ.showMessage("No image open", "There is no image open\nPlease, open an image first");
            return;
        }
        
        GenericDialog gd = new GenericDialog("Anomalous Diffusion Filters");
        gd.addChoice("Filtering method:", choiceItems, choiceItems[0]);
        
        
    }
    
}
