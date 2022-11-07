import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class hw1020 extends JFrame {

    private JLabel label;
    private JLabel title;
    HashMap<Integer, ImageIcon> icon = new HashMap<>();
    Image image;
    String[] imageName = { "1.png", "2.png", "3.png" };
    Integer currentNum=2;
    
    public static void main(String[] args) {
        hw1020 hw = new hw1020();
    }

    public hw1020() {
        setTitle("Change photo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300, 650);
        setResizable(false);

        getContentPane().setLayout(new BorderLayout());

        int i = 1;

        for (String item : imageName) {
            ImageIcon newIcon = new ImageIcon(item);
            image = newIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
            icon.put(i, new ImageIcon(image));
            i++;
        }

        label = new JLabel(icon.get(currentNum), SwingConstants.CENTER);
        title = new JLabel("Photo" + currentNum.toString(),SwingConstants.CENTER);
        getContentPane().add(label,"Center");
        getContentPane().add(title,"North");

        JButton nextOne = new JButton("next");
        JButton lastOne = new JButton("last");

        nextOne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(currentNum == 3)
                JOptionPane.showMessageDialog(getContentPane(),"no next");
                else{
                    currentNum++;
                    title.setText("Photo"+currentNum.toString());
                    label.setIcon(icon.get(currentNum));
                    getContentPane().revalidate();
                } 
            }
           
        });

        lastOne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(currentNum == 1)
                JOptionPane.showMessageDialog(getContentPane(),"no last");
                else{
                    currentNum--;
                    title.setText("Photo"+currentNum.toString());
                    label.setIcon(icon.get(currentNum));
                    getContentPane().revalidate();
                } 
            }
            
        });

        nextOne.setPreferredSize(new Dimension(100, 630));
        lastOne.setPreferredSize(new Dimension(100, 630));
        getContentPane().add(nextOne,"East");
        getContentPane().add(lastOne,"West");
        setVisible(true);

    }
}