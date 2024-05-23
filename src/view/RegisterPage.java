package view;

import model.RegisterModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPage extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField fullname;
    private JTextField birthdate;
    private JTextField registerNum;
    private JTextField phoneNum;
    private JTextField address;
    private JTextField email;
    private JLabel fullNameLabel;
    private JLabel birthDateLabel;
    private JLabel registerNumLabel;
    private JLabel phoneNumLabel;
    private JLabel adressLabel;
    private JLabel emailLabel;
    private JPanel bottomPane;
    private JPanel topPane;
    private JPanel labelPane;
    private JPanel textFieldPane;
    private JPanel buttonPane;

    public RegisterPage() {
        setTitle("Registration Page");
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        if(
                this.fullname.getText().isEmpty() ||
                this.birthdate.getText().isEmpty() ||
                this.registerNum.getText().isEmpty() ||
                this.phoneNum.getText().isEmpty() ||
                this.address.getText().isEmpty() ||
                this.email.getText().isEmpty()
        ){
            JOptionPane.showMessageDialog(null, "Semua formulir harus diisi", "Warning", JOptionPane.ERROR_MESSAGE);

        } else {
            int confirmDialog = JOptionPane.showConfirmDialog(
                    null,
                    "Konfirmasi data?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if(confirmDialog == JOptionPane.YES_OPTION){
                RegisterModel register = new RegisterModel(
                        fullname.getText(),
                        birthdate.getText(),
                        registerNum.getText(),
                        phoneNum.getText(),
                        address.getText(),
                        email.getText()
                );
                ResultPage.run(register);
                dispose();
            }
        }
    }

    public static void run() {
        RegisterPage dialog = new RegisterPage();
        dialog.setSize(400, 360);
        dialog.setVisible(true);
        System.exit(0);
    }
}
