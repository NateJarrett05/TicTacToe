import java.util.*;
public class Main {
  boolean game;
  String winner;
  public static void main(String[] args) {
    //Variables + find a way to print board properly
    String move;
    Main m = new Main();
    String response;
    String[] spot = {"-", "-", "-", "-", "-", "-", "-", "-", "-",};
    String[] spots = {"TL", "TM", "TR", "MR", "MM", "ML", "BL", "BM", "BR"};
    String TL = spot[0];
    String TM = spot[1];
    String TR = spot[2];
    String ML = spot[3];
    String MM = spot[4];
    String MR = spot[5];
    String BL = spot[6];
    String BM = spot[7];
    String BR = spot[8];

    Scanner userInput = new Scanner(System.in);

    for(int k = 0; k < 9; k++){

      List<String> list = Arrays.asList(spots);

      String[] tboard = {TL, TM, TR};
      String[] mboard = {ML, MM, MR};
      String[] bboard = {BL, BM, BR};

      if(k % 2 == 0){
        move = "O";
      }
      else{
        move = "X";
      }
      //Printing board
      System.out.println(Arrays.asList(tboard));
      System.out.println(Arrays.asList(mboard));
      System.out.println(Arrays.asList(bboard));
      System.out.println(move + "'s are up. Whats your next move? " + Arrays.asList(spots));
      response = userInput.nextLine();
      if(list.contains(response)){
        for(int i = 0; i < spots.length ; i++){
          if(response.equalsIgnoreCase(spots[i])){
            spot[i] = move;
            spots[i] = move;
          }
        }
        TL = spot[0];
        TM = spot[1];
        TR = spot[2];
        ML = spot[3];
        MM = spot[4];
        MR = spot[5];
        BL = spot[6];
        BM = spot[7];
        BR = spot[8];

        //Win conditions
        if((TL.equals("o")) && (TM.equals("o")) && (TR.equals("o")) || (TL.equals("x")) && (TM.equals("x")) && (TR.equals("x"))){
          m.game = true;
        }
        else if((ML.equals("o")) && (MM.equals("o")) && (MR.equals("o")) || (ML.equals("x")) && (MM.equals("x")) && (MR.equals("x"))){
          m.game = true;
        }
        else if((BL.equals("o")) && (BM.equals("o")) && (BR.equals("o")) || (BL.equals("x")) && (BM.equals("x")) && (BR.equals("x"))){
          m.game = true;
        }
        else if((TL.equals("o")) && (ML.equals("o")) && (BL.equals("o")) || (TL.equals("x")) && (ML.equals("x")) && (BL.equals("x"))){
          m.game = true;
        }
        else if((TM.equals("o")) && (MM.equals("o")) && (BM.equals("o")) || (TM.equals("x")) && (MM.equals("x")) && (BM.equals("x"))){
          m.game = true;
        }
        else if((TR.equals("o")) && (MR.equals("o")) && (BR.equals("o")) || (TR.equals("x")) && (MR.equals("x")) && (BR.equals("x"))){
          m.game = true;
        }
        else if((TL.equals("o")) && (MM.equals("o")) && (BR.equals("o")) || (TL.equals("x")) && (MM.equals("x")) && (BR.equals("x"))){
          m.game = true;
        }
        else if((TR.equals("o")) && (MM.equals("o")) && (BL.equals("o")) || (TR.equals("x")) && (MM.equals("x")) && (BL.equals("x"))){
          m.game = true;
        }

        if(m.game == true){
          if(k % 2 == 0){
            m.winner = "Player 2";
          }
          else{
            m.winner = "Player 1";
          }
          break;
        }
      }
      else{
        System.out.println("Catsgame");
        break;
      }
    }
    System.out.println(m.winner + " wins");
  }
}