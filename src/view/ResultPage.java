package view;

import model.RegisterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultPage extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel fullName;
    private JLabel birthDate;
    private JLabel registerNum;
    private JLabel address;
    private JLabel email;

    public ResultPage(RegisterModel result) {
        setTitle("Result Page");
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        fullName.setText(result.fullname);
        birthDate.setText(result.birthDate);
        registerNum.setText(result.registerNum);
        address.setText(result.address);
        email.setText(result.email);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void run(RegisterModel result) {
        ResultPage dialog = new ResultPage(result);
        dialog.setSize(400, 250);
        dialog.setVisible(true);
        System.exit(0);
    }

}
