/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import Jogo.Dado;
import Jogo.Jogo;
import Connection_Questoes.Questoes;
import Connection_MySQL_QuestoesDAO.QuestoesDAO;
import Connection_MySQL_RespostasDAO.RespostasDAO;
import Connection_Respostas.Respostas;
import javax.swing.JRadioButton;
import Connection_Usuarios.Usuario;
import javax.swing.JOptionPane;


/**
 *
 * @author 23.01425-3
 */
public class TelaQuestao extends javax.swing.JFrame {

    /**
     * Creates new form telaQuestao
     */
       Jogo jogo;
    public TelaQuestao(){
        initComponents();
    }
    public TelaQuestao(Jogo jogo) {
        initComponents();
        setLocationRelativeTo(null);
        this.jogo = jogo;
        String ra = jogo.getRa();
    
        var questoesDAO = new QuestoesDAO();
        String casaFinal = jogo.getCasaFinal();
        var questoes = new Questoes(casaFinal);
        
    
        try{
            String enunciado = questoesDAO.vaiEnunciado(questoes);
            String alternativaA = questoesDAO.listarAlternativaA(questoes);
            String alternativaB = questoesDAO.listarAlternativaB(questoes);
            String alternativaC = questoesDAO.listarAlternativaC(questoes);
            String alternativaD = questoesDAO.listarAlternativaD(questoes);

          //  enunciadoTextArea.setText(questoesDAO.listar1(casaFinal));
           enunciadoTextArea.setText(enunciado);
           alternativaALabel.setText(alternativaA);
           alternativaBLabel.setText(alternativaB);
           alternativaCLabel.setText(alternativaC);
           alternativaDLabel.setText(alternativaD);
            } catch(Exception e){
            System.out.println(e);
            }
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        responderButton = new javax.swing.JButton();
        bolinhaA = new javax.swing.JRadioButton();
        bolinhaB = new javax.swing.JRadioButton();
        bolinhaC = new javax.swing.JRadioButton();
        bolinhaD = new javax.swing.JRadioButton();
        alternativaALabel = new javax.swing.JLabel();
        alternativaBLabel = new javax.swing.JLabel();
        alternativaCLabel = new javax.swing.JLabel();
        responderButtonLabel = new javax.swing.JLabel();
        alternativaDLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enunciadoTextArea = new javax.swing.JTextArea();
        telaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        responderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/responderButtonImage.png"))); // NOI18N
        responderButton.setBorderPainted(false);
        responderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        responderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responderButtonActionPerformed(evt);
            }
        });
        getContentPane().add(responderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 190, 60));

        buttonGroup1.add(bolinhaA);
        bolinhaA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bolinhaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolinhaAActionPerformed(evt);
            }
        });
        getContentPane().add(bolinhaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        buttonGroup1.add(bolinhaB);
        bolinhaB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bolinhaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolinhaBActionPerformed(evt);
            }
        });
        getContentPane().add(bolinhaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 20, -1));

        buttonGroup1.add(bolinhaC);
        bolinhaC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bolinhaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        buttonGroup1.add(bolinhaD);
        bolinhaD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bolinhaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        alternativaALabel.setText("exemplo");
        getContentPane().add(alternativaALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 336, 980, 20));

        alternativaBLabel.setText("exemplo");
        getContentPane().add(alternativaBLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 980, -1));

        alternativaCLabel.setText("exemplo");
        getContentPane().add(alternativaCLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 970, -1));

        responderButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/responderButtonImage.png"))); // NOI18N
        getContentPane().add(responderButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        alternativaDLabel.setText("exemplo");
        getContentPane().add(alternativaDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 980, -1));

        enunciadoTextArea.setEditable(false);
        enunciadoTextArea.setColumns(20);
        enunciadoTextArea.setRows(5);
        enunciadoTextArea.setAutoscrolls(false);
        enunciadoTextArea.setBorder(null);
        jScrollPane1.setViewportView(enunciadoTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 840, 110));

        telaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaPerguntaImage.png"))); // NOI18N
        getContentPane().add(telaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void responderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responderButtonActionPerformed

        var questoesDAO = new QuestoesDAO();
        String casaFinal = jogo.getCasaFinal();
        int intCasaFinal = Integer.parseInt(jogo.getCasaFinal());
        var questoes = new Questoes(casaFinal);
        int vidas = Integer.parseInt(jogo.getVidas());
        
        var u = new Usuario();
        String ra = u.getRa();
        //não sei se essa parte está certa
        var r = new Respostas(ra);
        String pontuacaoInicial = jogo.getPontuacao();
        String respostaCorreta = "True";
        try{
            respostaCorreta = questoesDAO.verificacaoResposta(questoes);
        } catch(Exception e){
            System.out.println(e);
        }
        
        String verificacao = "False";
        if(bolinhaA.isSelected()){
            verificacao = "Alternativa A";
        } else if(bolinhaB.isSelected()){
            verificacao = "Alternativa B";
        } else if(bolinhaC.isSelected()){
            verificacao = "Alternativa C";
        }else if(bolinhaD.isSelected()){
            verificacao = "Alternativa D";
        }
        
        if(verificacao.equals(respostaCorreta)){
                if(intCasaFinal<17){
                    int intPontuacao = Integer.parseInt(pontuacaoInicial) + 60;
                    String pontuacao = Integer.toString(intPontuacao);
                    jogo.setPontuacao(pontuacao);
                    int numero = Integer.parseInt(jogo.getCasaFinal());
                    numero = numero + 1;
                    casaFinal = Integer.toString(numero);
                    jogo.setCasaFinal(casaFinal);
                    JOptionPane.showMessageDialog(null, "Você acertou!");
                    System.out.println(casaFinal);
                    System.out.println(vidas);
                    System.out.println(pontuacao);
                    switch(numero) {
                        case 1:
                          TelaJogo telaJogo = new TelaJogo(ra);
                          telaJogo.setVisible(true);
                          break;
                        case 2:
                          TelaJogo2 telaJogo2 = new TelaJogo2(ra,jogo);
                          telaJogo2.setVisible(true);
                          break;
                        case 3:
                          TelaJogo3 telaJogo3 = new TelaJogo3(ra,jogo);
                          telaJogo3.setVisible(true);
                          break;
                        case 4:
                          TelaJogo4 telaJogo4 = new TelaJogo4(ra,jogo);
                          telaJogo4.setVisible(true);
                          break;
                        case 5:
                          TelaJogo5 telaJogo5 = new TelaJogo5(ra,jogo);
                          telaJogo5.setVisible(true);
                          break;
                        case 6:
                          TelaJogo6 telaJogo6 = new TelaJogo6(ra,jogo);
                          telaJogo6.setVisible(true);
                          break;
                        case 7:
                          TelaJogo7 telaJogo7 = new TelaJogo7(ra,jogo);
                          telaJogo7.setVisible(true);
                          break;
                        case 8:
                          TelaJogo8 telaJogo8 = new TelaJogo8(ra,jogo);
                          telaJogo8.setVisible(true);
                          break;
                        case 9:
                          TelaJogo9 telaJogo9 = new TelaJogo9(ra,jogo);
                          telaJogo9.setVisible(true);
                          break;
                        case 10:
                          TelaJogo10 telaJogo10 = new TelaJogo10(ra,jogo);
                          telaJogo10.setVisible(true);
                          break;
                        case 11:
                          TelaJogo11 telaJogo11 = new TelaJogo11(ra,jogo);
                          telaJogo11.setVisible(true);
                          break;
                        case 12:
                          TelaJogo12 telaJogo12 = new TelaJogo12(ra,jogo);
                          telaJogo12.setVisible(true);
                          break;
                        case 13:
                          TelaJogo13 telaJogo13 = new TelaJogo13(ra,jogo);
                          telaJogo13.setVisible(true);
                          break;
                        case 14:
                          TelaJogo14 telaJogo14 = new TelaJogo14(ra,jogo);
                          telaJogo14.setVisible(true);
                          break;
                        case 15:
                          TelaJogo15 telaJogo15 = new TelaJogo15(ra,jogo);
                          telaJogo15.setVisible(true);
                          break;
                        case 16:
                          TelaJogo16 telaJogo16 = new TelaJogo16(ra,jogo);
                          telaJogo16.setVisible(true);
                          break;
                        case 17:
                          TelaJogo17 telaJogo17 = new TelaJogo17(ra,jogo);
                          telaJogo17.setVisible(true);
                          break;
                    }
                    dispose();
                    
                }else if(intCasaFinal==17){
                    JOptionPane.showMessageDialog(null, "Você acertou!");
                    int intPontuacao = Integer.parseInt(jogo.getPontuacao()) + 60;
                    String pontuacao = Integer.toString(intPontuacao);
                    jogo.setPontuacao(pontuacao);
                    var respostas = new Respostas(jogo.getRa(), intPontuacao);
                    var rDAO = new RespostasDAO();
                    System.out.println(casaFinal);
                    System.out.println(vidas);
                    System.out.println(pontuacao);
                    try{
                        rDAO.inserirPontuacao(respostas);
                    }catch(Exception e){
                      System.out.println(e);
                    }
                    if(intPontuacao<1000){
                        var telaPontuacao = new TelaPontuacao(intPontuacao);
                        telaPontuacao.setVisible(true);
                        dispose();
                    }else{
                        var telaPontuacao1000 = new TelaPontuacao1000();
                        telaPontuacao1000.setVisible(true);
                        dispose();
                    }
                }
        }else{
            int intVidas = Integer.parseInt(jogo.getVidas());
            intVidas = intVidas - 1;
            String localVidas = Integer.toString(intVidas);
            jogo.setVidas(localVidas);
            int numero = Integer.parseInt(jogo.getCasaFinal());
            numero = numero + 1;
            casaFinal = Integer.toString(numero);
            jogo.setCasaFinal(casaFinal);
            JOptionPane.showMessageDialog(null, "Que pena, você errou.");
            System.out.println(casaFinal);
            System.out.println(localVidas);
            System.out.println(pontuacaoInicial);
            if(intVidas>=1){
                if (intCasaFinal==17){
                    int intPontuacao = Integer.parseInt(jogo.getPontuacao());
                    String pontuacao = Integer.toString(intPontuacao);
                    var respostas = new Respostas(jogo.getRa(), intPontuacao);
                    var rDAO = new RespostasDAO();
                    System.out.println(jogo.getRa());
                    System.out.println(casaFinal);
                    System.out.println(vidas);
                    System.out.println(pontuacao);
                    try{
                        rDAO.inserirPontuacao(respostas);
                    }catch(Exception e){
                      System.out.println(e);
                    }
                    if(intPontuacao<1000){
                        var telaPontuacao = new TelaPontuacao(intPontuacao);
                        telaPontuacao.setVisible(true);
                        dispose();
                    }else{
                        var telaPontuacao1000 = new TelaPontuacao1000();
                        telaPontuacao1000.setVisible(true);
                        dispose();
                    }
                } else {
                switch(numero) {
                        case 1:
                          TelaJogo telaJogo = new TelaJogo(ra);
                          telaJogo.setVisible(true);
                          break;
                        case 2:
                          TelaJogo2 telaJogo2 = new TelaJogo2(ra,jogo);
                          telaJogo2.setVisible(true);
                          break;
                        case 3:
                          TelaJogo3 telaJogo3 = new TelaJogo3(ra,jogo);
                          telaJogo3.setVisible(true);
                          break;
                        case 4:
                          TelaJogo4 telaJogo4 = new TelaJogo4(ra,jogo);
                          telaJogo4.setVisible(true);
                          break;
                        case 5:
                          TelaJogo5 telaJogo5 = new TelaJogo5(ra,jogo);
                          telaJogo5.setVisible(true);
                          break;
                        case 6:
                          TelaJogo6 telaJogo6 = new TelaJogo6(ra,jogo);
                          telaJogo6.setVisible(true);
                          break;
                        case 7:
                          TelaJogo7 telaJogo7 = new TelaJogo7(ra,jogo);
                          telaJogo7.setVisible(true);
                          break;
                        case 8:
                          TelaJogo8 telaJogo8 = new TelaJogo8(ra,jogo);
                          telaJogo8.setVisible(true);
                          break;
                        case 9:
                          TelaJogo9 telaJogo9 = new TelaJogo9(ra,jogo);
                          telaJogo9.setVisible(true);
                          break;
                        case 10:
                          TelaJogo10 telaJogo10 = new TelaJogo10(ra,jogo);
                          telaJogo10.setVisible(true);
                          break;
                        case 11:
                          TelaJogo11 telaJogo11 = new TelaJogo11(ra,jogo);
                          telaJogo11.setVisible(true);
                          break;
                        case 12:
                          TelaJogo12 telaJogo12 = new TelaJogo12(ra,jogo);
                          telaJogo12.setVisible(true);
                          break;
                        case 13:
                          TelaJogo13 telaJogo13 = new TelaJogo13(ra,jogo);
                          telaJogo13.setVisible(true);
                          break;
                        case 14:
                          TelaJogo14 telaJogo14 = new TelaJogo14(ra,jogo);
                          telaJogo14.setVisible(true);
                          break;
                        case 15:
                          TelaJogo15 telaJogo15 = new TelaJogo15(ra,jogo);
                          telaJogo15.setVisible(true);
                          break;
                        case 16:
                          TelaJogo16 telaJogo16 = new TelaJogo16(ra,jogo);
                          telaJogo16.setVisible(true);
                          break;
                        case 17:
                          TelaJogo17 telaJogo17 = new TelaJogo17(ra,jogo);
                          telaJogo17.setVisible(true);
                          break;
                    }
                dispose();
                }
            }else{
                int intPontuacao = Integer.parseInt(jogo.getPontuacao());
                String pontuacao = Integer.toString(intPontuacao);
                var respostas = new Respostas(jogo.getRa(), intPontuacao);
                var rDAO = new RespostasDAO();
                System.out.println(jogo.getRa());
                System.out.println(casaFinal);
                System.out.println(vidas);
                System.out.println(pontuacao);
                try{
                    rDAO.inserirPontuacao(respostas);
                }catch(Exception e){
                  System.out.println(e);
                }
                var telaGameOver = new TelaGameOver(jogo);
                telaGameOver.setVisible(true);
                dispose();
            }
            
        }
            
            
        
        
    }//GEN-LAST:event_responderButtonActionPerformed

    private void bolinhaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolinhaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bolinhaAActionPerformed

    private void bolinhaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolinhaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bolinhaBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alternativaALabel;
    private javax.swing.JLabel alternativaBLabel;
    private javax.swing.JLabel alternativaCLabel;
    private javax.swing.JLabel alternativaDLabel;
    private javax.swing.JRadioButton bolinhaA;
    private javax.swing.JRadioButton bolinhaB;
    private javax.swing.JRadioButton bolinhaC;
    private javax.swing.JRadioButton bolinhaD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea enunciadoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton responderButton;
    private javax.swing.JLabel responderButtonLabel;
    private javax.swing.JLabel telaLabel;
    // End of variables declaration//GEN-END:variables
}