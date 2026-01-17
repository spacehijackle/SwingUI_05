package swingui_05;

import javax.swing.SwingUtilities;

import swingui_05.face.FaceChanger;
import swingui_05.phrase.PhraseSelector;

public class Startup
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new PhraseSelector().selectCharacter());
        SwingUtilities.invokeLater(() -> new FaceChanger().playWithFace());
    }
}
