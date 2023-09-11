

package ejercicio6;

import java.util.TreeSet;


public class MenúGeneral extends javax.swing.JFrame {
public static TreeSet <Producto> productos=new TreeSet<>();
    
    public MenúGeneral() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuPrecio = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(51, 51, 0));
        escritorio.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuu.setText("Administracion");
        jMenuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuuActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuu.add(jMenuItem1);

        jMenuBar1.add(jMenuu);

        jMenu2.setText("Consulta");

        jMenuItem2.setText("Por nombre");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuPrecio.setText("Por precio");
        jMenuPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuPrecio);

        jMenuItem4.setText("Por rubro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       BusquedaPorNombre bpn =new BusquedaPorNombre();
     bpn.setVisible(true);
     escritorio.add(bpn);
     escritorio.moveToFront(bpn);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuuActionPerformed
       
    }//GEN-LAST:event_jMenuuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         escritorio.removeAll();
       escritorio.repaint();
      GestionarProductos gp =new GestionarProductos();
     gp.setVisible(true);
     escritorio.add(gp);
     escritorio.moveToFront(gp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     escritorio.removeAll();
     escritorio.repaint();
     BusquedaPorRubro bpr=new BusquedaPorRubro();
     bpr.setVisible(true);
     escritorio.add(bpr);
       escritorio.moveToFront(bpr);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrecioActionPerformed
       escritorio.removeAll();
     escritorio.repaint();
     BusquedaPorPrecio bpp=new BusquedaPorPrecio();
     bpp.setVisible(true);
     escritorio.add(bpp);
       escritorio.moveToFront(bpp);
    }//GEN-LAST:event_jMenuPrecioActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenúGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuPrecio;
    private javax.swing.JMenu jMenuu;
    // End of variables declaration//GEN-END:variables

}
