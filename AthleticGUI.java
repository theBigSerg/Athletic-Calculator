import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

public class AthleticGUI extends Frame{

    Button btn;
    SurveyAthlete sa = new SurveyAthlete();
    AthleticCalculator ac = new AthleticCalculator(sa.completeSurvey());
    
    private JLabel label;

   
        public AthleticGUI() {
          btn = new Button("Click to See Athletic Calculator");
          

          btn.setBounds(200, 200, 50, 50);
          add(btn);
          setSize(300, 300);
          setTitle("Athletic Calculator");
          setLayout(new FlowLayout());
          setVisible(true);
          addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent we) {
                  dispose();
              }
          });
        btn.addActionListener(new ActionListener(){
            @Override
              public void actionPerformed(ActionEvent e){
                  //System.out.println("test");
                  System.out.println(ac);
                  ac.print();
          
          }
      });
    }
          

          
        
        
    
public static void main(String[] args){

        
        
new AthleticGUI();

 
}

}




