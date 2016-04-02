/**
 *  Name : SHRAVAN C
 *  COLLEGE : Manipal Institute of Technology
 *  Outer Frame which has the Label - Changing Properties.
 */
package xcosondesktop;
import java.awt.event.InputEvent;
import java.awt.Color;

public class XcosOnDesktop extends javax.swing.JFrame {
public static XcosOnDesktop s;
    /**
     * Creates new form XcosOnDesktop
     */
    public XcosOnDesktop() {
        initComponents();
        jPanel3.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 150, 243));
        setPreferredSize(new java.awt.Dimension(820, 550));

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 550));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightClickRemover(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(238, 238, 238));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("       Change Properties");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setIconTextGap(10);
        jLabel1.setInheritsPopupMenu(false);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightClick(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));
        jPanel3.setToolTipText("");

        jList1.setBackground(new java.awt.Color(250, 250, 250));
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238), 0));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Option1", "Option2", "Properties" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setFixedCellHeight(35);
        jList1.setVisibleRowCount(3);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propertiesOption(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(52, 73, 94));
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }
	// Logic to Set the Label Text  
void setLabelText(String s)
{
    s="       "+s;
    jLabel1.setText(s);
    
}
// Logic to Set the Background Colour of the Label 
void setLabelBCOLOR(String s[])
{
        int color[] = new int[3];
        for (int i = 0; i < 3; i++)
        {
            try 
            {
                color[i] = Integer.parseInt(s[i]);
            } catch (NumberFormatException nfe) { };
        }
    Color cutomColor = new Color(color[0],color[1],color[2]);
    jLabel1.setBackground(cutomColor);  
}
// Logic to Set the Font Colour of the Label 
void setLabelFCOLOR(String s[])
{
        int color[] = new int[3];
        
        for (int i = 0; i < 3; i++)
        {
            try 
            {
                color[i] = Integer.parseInt(s[i]);
            } catch (NumberFormatException nfe) { };
        }
    Color cutomColor = new Color(color[0],color[1],color[2]);
    jLabel1.setForeground(cutomColor);
}
    private void rightClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightClick
        int m = evt.getModifiers();
        if ((m & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
            jPanel3.setVisible(true);
        }
    }//GEN-LAST:event_rightClick

    private void rightClickRemover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightClickRemover
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jLabel2.setVisible(false);
    }//GEN-LAST:event_rightClickRemover

    private void propertiesOption(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propertiesOption
        // TODO add your handling code here:
       if(jList1.getSelectedValue() == "Properties")
       {   jPanel3.setVisible(false);
           s.jLabel2.setVisible(false);
           new PropertiesChange(s).setVisible(true);
        
       }
       else if (jList1.getSelectedValue() == "Option1")
       {
           jPanel3.setVisible(false);
           jLabel2.setVisible(true);
           jLabel2.setText("Option1 Currently Not available. ");
       }
       else if (jList1.getSelectedValue() == "Option2")
       {
           jPanel3.setVisible(false);
           jLabel2.setVisible(true);
           jLabel2.setText("Option2 Currently Not available. ");
       }
    }//GEN-LAST:event_propertiesOption

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XcosOnDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XcosOnDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XcosOnDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XcosOnDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              s =  new XcosOnDesktop();
              s.setVisible(true);
              s.jLabel2.setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
