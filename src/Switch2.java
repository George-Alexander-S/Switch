import static javax.swing.JOptionPane.*;

public class Switch2 {
    public static void main(String[] args) {
        double resultat = 0;

        double tall1 = Double.parseDouble(showInputDialog("Skriv inn tall 1"));
        String regneart = showInputDialog(" + , - , * , / ");
        double tall2 = Double.parseDouble(showInputDialog("Skriv inn tall 2"));

        /*
        if (regneart.equals("+")) {
            resultat = tall1 + tall2;
        }
        if (regneart.equals("-")) {
            resultat = tall1 - tall2;
        }
        if (regneart.equals("*")) {
            resultat = tall1 * tall2;
        }
        if (regneart.equals("/")) {
            resultat = tall1 / tall2;
        } */

        switch (regneart) {
            case "+":
                resultat = tall1 + tall2;
                break;
            case "-":
                resultat = tall1 - tall2;
                break;
            case "*":
                resultat = tall1 * tall2;
                break;
            case "/":
                resultat = tall1 / tall2;
                break;
        }
        showMessageDialog(null, "Resultatet av regnestykket ble: "+tall1+" "+regneart+" "+tall2+" = "+resultat);
    }
}
