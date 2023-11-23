package Tienda;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class TiendaChickenHouse extends javax.swing.JFrame 
{
	public TiendaChickenHouse() 
	{
		String productos[] = {"Pollo","Pollo s/ piel","Pata Muslo","Presa Esp","Pechuga","Suprema","Supremas Rellenas","Filet","Alita","Menudo","Puchero","Higado","Pollo x cajon","Gallina","Filet x mayor","Filet Poke","Band. HBM","Band. HCM","Band. HCG","Doc. HM","Doc. HG"};
		double precios[] = {990,1600,1060,1700,1600,2100,2700,2300,600,300,300,450,19500,600,1950,1850,1900,2000,2100,1000,1100};
		double precio = 0;
		double cantidad = 0;
		initComponents();
		initComponents();
		this.setTitle("Chicken House");
		Image icono=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pollo.png"));
		this.setIconImage(icono);


		this.setLocationRelativeTo(null);
		Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pollo.png"));
		lblLogo.setIcon(new ImageIcon(logo.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),Image.SCALE_SMOOTH)));
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		//Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/agregar.png"));
		//btnAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(10,10, Image.SCALE_SMOOTH)));
		DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
		cboProducto.setModel(comboModel);

	}
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblLogo = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                btnAgregar = new javax.swing.JButton();
                cboProducto = new javax.swing.JComboBox<>();
                spnCantidad = new javax.swing.JSpinner();
                lblImporte = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblProductos = new javax.swing.JTable();
                lblPrecio = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                lblSubtotal = new javax.swing.JLabel();
                lblTotal = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 30));

                jLabel1.setText("CANTIDAD");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 25));

                jLabel2.setText("iMPORTE");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, 25));

                jLabel3.setText("PRODUCTO");
                getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 25));

                jLabel4.setText("PRECIO");
                getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, 25));

                btnAgregar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
                btnAgregar.setText("(+)");
                btnAgregar.setToolTipText("");
                btnAgregar.setAutoscrolls(true);
                btnAgregar.setIconTextGap(0);
                btnAgregar.setInheritsPopupMenu(true);
                btnAgregar.setOpaque(false);
                btnAgregar.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                                btnAgregarComponentHidden(evt);
                        }
                });
                btnAgregar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAgregarActionPerformed(evt);
                        }
                });
                getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 50, 50));

                cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                cboProducto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cboProductoActionPerformed(evt);
                        }
                });
                getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 100, 25));
                getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, 25));

                lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblImporte.setText("$XXX");
                getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 70, 25));

                jLabel6.setText("SUBTOTAL");
                getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, 25));

                tblProductos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
                tblProductos.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                jScrollPane1.setViewportView(tblProductos);

                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 460, 150));

                lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblPrecio.setText("$XXX");
                getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, 25));

                jLabel8.setText("TOTAL");
                getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, 25));

                lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblSubtotal.setText("$X");
                getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 70, 25));

                lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lblTotal.setText("$XX");
                getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 70, 25));

                jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
                jLabel9.setText("HOUSE");
                getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

                jLabel12.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
                jLabel12.setText("CHICKEN ");
                getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnAgregarActionPerformed

        private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_cboProductoActionPerformed

        private void btnAgregarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnAgregarComponentHidden
                // TODO add your handling code here:
        }//GEN-LAST:event_btnAgregarComponentHidden
	public static void main(String args[]) {
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TiendaChickenHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		
		//</editor-fold>

		java.awt.EventQueue.invokeLater(() -> {
			new TiendaChickenHouse().setVisible(true);
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private static javax.swing.JButton btnAgregar;
        private javax.swing.JComboBox<String> cboProducto;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblImporte;
        private javax.swing.JLabel lblLogo;
        private javax.swing.JLabel lblPrecio;
        private javax.swing.JLabel lblSubtotal;
        private javax.swing.JLabel lblTotal;
        private javax.swing.JSpinner spnCantidad;
        private javax.swing.JTable tblProductos;
        // End of variables declaration//GEN-END:variables
}
