// ============================================================================
//    Taken and adapted from: http://programmingnotes.org/
// ============================================================================
import javax.swing.*;
import java.awt.*;

public class Logic
{
    public static void getMove(int rowMove, int colMove, int move, Font font, JButton square[][], 
    String startingPlayer)
    {   // gets the current move "X" or "O" for the user & displays to screen
        square[rowMove][colMove].setFont(font);
        
        //TODO: create logic to set which player made the move

        if(startingPlayer=="X"){
            if(move%2 != 0){
                square[rowMove][colMove].setText("O");
                
            }
            else{
                square[rowMove][colMove].setText("X");
            }
        }
        if(startingPlayer=="O"){
            if(move%2 !=0){
                square[rowMove][colMove].setText("X");
            }
            else{
                square[rowMove][colMove].setText("O");
            }
    }


}
    public static void showGame(JPanel pnlSouth, JPanel pnlPlayingField)
    {   // shows the Playing Field
        pnlSouth.setLayout(new BorderLayout());
        pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
        pnlPlayingField.requestFocus(); 
    }

    public static void clearPanelSouth(JPanel pnlSouth, JPanel pnlTop, 
    JPanel pnlNewGame, JPanel pnlPlayingField, JPanel pnlBottom, JPanel radioPanel) 
    {   // clears any posible panels on screen
        pnlSouth.remove(pnlTop); 
        pnlSouth.remove(pnlBottom);
        pnlSouth.remove(pnlPlayingField);
        pnlTop.remove(pnlNewGame);
        pnlSouth.remove(radioPanel);
    }
}
