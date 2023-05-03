import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Rebus1 {

    Rebus1(){

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 15);


        JLabel intrebare_unu = new JLabel();
        intrebare_unu.setText("1. Ajuta la efectuarea de calcule");
        intrebare_unu.setFont(font);
        JPanel panel_intrebare_unu = new JPanel();
        panel_intrebare_unu.add(intrebare_unu);
        panel_intrebare_unu.setBounds(0,10,300,25);

        JLabel intrebare_doi = new JLabel();
        intrebare_doi.setText("2. Carte de joc care urmeaza valetului");
        intrebare_doi.setFont(font);
        JPanel panel_intrebare_doi = new JPanel();
        panel_intrebare_doi.add(intrebare_doi);
        panel_intrebare_doi.setBounds(0,60,300,25);

        JLabel intrebare_trei = new JLabel();
        intrebare_trei.setText("3. Judet din Romania");
        intrebare_trei.setFont(font);
        JPanel panel_intrebare_trei = new JPanel();
        panel_intrebare_trei.add(intrebare_trei);
        panel_intrebare_trei.setBounds(0,110,300,25);

        JLabel intrebare_patru = new JLabel();
        intrebare_patru.setText("4. Un lac imens");
        intrebare_patru.setFont(font);
        JPanel panel_intrebare_patru = new JPanel();
        panel_intrebare_patru.add(intrebare_patru);
        panel_intrebare_patru.setBounds(0,160,300,25);

        JLabel intrebare_cinci = new JLabel();
        intrebare_cinci.setText("5. Primul om");
        intrebare_cinci.setFont(font);
        JPanel panel_intrebare_cinci = new JPanel();
        panel_intrebare_cinci.add(intrebare_cinci);
        panel_intrebare_cinci.setBounds(0,210,300,25);

        JLabel intrebare_sase = new JLabel();
        intrebare_sase.setText("6. Cilindru rezistent de fier");
        intrebare_sase.setFont(font);
        JPanel panel_intrebare_sase = new JPanel();
        panel_intrebare_sase.add(intrebare_sase);
        panel_intrebare_sase.setBounds(0,260,300,25);

        JLabel intrebare_sapte = new JLabel();
        intrebare_sapte.setText("7. Care nu este dulce");
        intrebare_sapte.setFont(font);
        JPanel panel_intrebare_sapte = new JPanel();
        panel_intrebare_sapte.add(intrebare_sapte);
        panel_intrebare_sapte.setBounds(0,310,300,25);

        JLabel intrebare_opt = new JLabel();
        intrebare_opt.setText("8. Coborare drastica");
        intrebare_opt.setFont(font);
        JPanel panel_intrebare_opt = new JPanel();
        panel_intrebare_opt.add(intrebare_opt);
        panel_intrebare_opt.setBounds(0,360,300,25);

        JLabel intrebari_vertical = new JLabel();
        intrebari_vertical.setText("Intrebarile de la 1 - 4 sunt pe orizontala");
        intrebari_vertical.setFont(font);
        JPanel panel_intrebari_vertical = new JPanel();
        panel_intrebari_vertical.add(intrebari_vertical);
        panel_intrebari_vertical.setBounds(0,410,300,25);

        JLabel intrebari_orizontal = new JLabel();
        intrebari_orizontal.setText("Intrebarile de la 4 - 8 sunt pe verticala");
        intrebari_orizontal.setFont(font);
        JPanel panel_intrebari_orizontal = new JPanel();
        panel_intrebari_orizontal.add(intrebari_orizontal);
        panel_intrebari_orizontal.setBounds(0,430,300,25);

        JButton buton_try = new JButton("Incearca!");
        buton_try.setBounds(400, 500, 100, 30);
        JTextField text_buton_try = new JTextField(10);
        text_buton_try.setBounds(400, 470, 100, 30);

        JTable table = new JTable(4,4);
        table.setEnabled(false);
        table.setRowHeight(50);
        JPanel panel_table = new JPanel();
        panel_table.add(table);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        table.setFont(font);
        panel_table.setBounds(450, 150,320, 300);

        buton_try.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String mesaj = text_buton_try.getText().toUpperCase();

                switch (mesaj){
                    case "ABAC":
                        List<Character> chars = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars.get(i);
                            table.setValueAt(temp,0, i);
                        }
                        break;
                    case "DAMA":
                        List<Character> chars1 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars1.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars1.get(i);
                            table.setValueAt(temp,1, i);
                        }
                        break;
                    case "ARAD":
                        List<Character> chars2 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars2.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars2.get(i);
                            table.setValueAt(temp,2, i);
                        }
                        break;
                    case "MARE":
                        List<Character> chars3 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars3.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars3.get(i);
                            table.setValueAt(temp,3, i);
                        }
                        break;
                    case "ADAM":List<Character> chars4 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars4.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars4.get(i);
                            table.setValueAt(temp,i, 0);
                        }
                        break;
                    case "BARA":
                        List<Character> chars5 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars5.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars5.get(i);
                            table.setValueAt(temp,i, 1);
                        }
                        break;
                    case "AMAR":
                        List<Character> chars6 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars6.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars6.get(i);
                            table.setValueAt(temp,i, 2);
                        }
                        break;
                    case "CADE":
                        List<Character> chars7 = new ArrayList<>();
                        for (char ch: mesaj.toCharArray()) {
                            chars7.add(ch);
                        }

                        for (int i = 0; i < 4;i++){
                            Character temp = chars7.get(i);
                            table.setValueAt(temp,i, 3);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Raspuns incorect, incercati din nou!");
                }
                boolean Castigat = false;
                outer : for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 4; j++){
                        if(table.getValueAt(i,j) == null){
                            Castigat = false;
                            break outer;
                        }
                        else{
                            Castigat = true;
                        }
                    }
                }
                if(Castigat) {
                    JOptionPane.showMessageDialog(null,"Felicitari, ati castigat!");
                    File rebusFolder = new File("Rebuses");
                    rebusFolder.mkdir();

                    String rebusContent = "A B A C\nD A M A\nA R A D\nM A R E";
                    File rebusFile = new File(rebusFolder, "Rebus1.txt");

                    try {
                        FileWriter writer = new FileWriter(rebusFile);
                        writer.write(rebusContent);
                        writer.close();
                    } catch (IOException E) {
                        E.printStackTrace();
                    }
                }
            }

        });

        JFrame frame_principal = new JFrame("Test");
        frame_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_principal.setResizable(false);
        frame_principal.setLayout(null);
        frame_principal.setSize(900,600);
        frame_principal.setVisible(true);
        frame_principal.add(panel_intrebare_unu);
        frame_principal.add(panel_intrebare_doi);
        frame_principal.add(panel_intrebare_trei);
        frame_principal.add(panel_intrebare_patru);
        frame_principal.add(panel_intrebare_cinci);
        frame_principal.add(panel_intrebare_sase);
        frame_principal.add(panel_intrebare_sapte);
        frame_principal.add(panel_intrebare_opt);
        frame_principal.add(panel_intrebari_vertical);
        frame_principal.add(panel_intrebari_orizontal);
        frame_principal.add(buton_try);
        frame_principal.add(panel_table);
        frame_principal.add(text_buton_try);
    }
}