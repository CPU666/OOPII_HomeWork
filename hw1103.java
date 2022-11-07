import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.util.*;

class CityMountains extends JFrame implements ListSelectionListener{
    private JLabel jla1;
    private JList mounList;
    private JTextArea showText;
    String[] city = {"台北","桃園","宜蘭","彰化","台南","我家","嘉義","高雄"};
    String[] mountain = {"象山","龜山","太平山","八卦山","大凍山","枕頭山","阿里山","壽山"};

    CityMountains(){
        setTitle("好山好水好無聊");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 450, 450);
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);

        jla1 = new JLabel("找各地好山：");
        add(jla1);
        jla1.setBounds(20, 20, 75, 20);

        mounList = new JList<String>(city);
        mounList.addListSelectionListener(this);
        JScrollPane jsp1 = new JScrollPane(mounList);
        add(mounList);
        mounList.setBounds(100, 20, 75, 75);
        

        showText = new JTextArea("可選取地名...");
        JScrollPane jsp2 = new JScrollPane(showText,ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jsp2.setBounds(20,150 , 150, 75);
        add(jsp2);
    
        setVisible(true);
    
    }

    public void valueChanged(ListSelectionEvent e){
        String text = "";

        for(int i=0;i<city.length;i++){
            if(mounList.isSelectedIndex(i)){
                text =city[i]+" 名山： "+mountain[i];
            }
        }
        showText.setText(text);
    }
    
}

public class hw1103{
    public static void main(String[] args) {
        CityMountains cm = new CityMountains();
    }
}
