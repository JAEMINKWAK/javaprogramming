package org.example;

import javax.swing.*;
import java.awt.event.*;

public class Myframe extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;

    public Myframe() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오.");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다.");

        // this는 현재 클래스(Myframe)가 ActionListener를 구현했기 때문에 사용 가능
        button.addActionListener(this);

        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    // 이벤트 처리 메서드 (정확한 이름!)
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("마침내 버튼이 눌려졌습니다.");
        }
    }
}
