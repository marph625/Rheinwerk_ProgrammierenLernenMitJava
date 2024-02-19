    /* Programm, um zu bestimmen, ob ein Jahr ein Schaltjahr ist oder nicht
     */

    import javax.swing.JOptionPane;

    public class Schaltjahr {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            String eingabe_jahr = JOptionPane.showInputDialog("Gib ein Jahr ein und ich sage dir, ob es ein Schaltjahr ist, Bruder!");
            int jahr = Integer.parseInt(eingabe_jahr);

            if (jahr % 4 == 0) {
                if (jahr % 100 == 0) {
                    if (jahr % 400 == 0) {
                        JOptionPane.showMessageDialog(null, "Treffer");
                    } else {
                        JOptionPane.showMessageDialog(null, "Kein Schaltjahr");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Treffer");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kein Schaltjahr");
            }
        }
    }
