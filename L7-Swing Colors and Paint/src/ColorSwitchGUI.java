import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window;
    JPanel panel;
    JButton colorThemeDark;
    JButton colorThemePrimary;
    JButton colorThemeWarren;

    //Declare your frame, panel and three buttons.

    public ColorSwitchGUI() {
        //create your GUI
        window = new JFrame("Color switcher");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 200);
        window.setLocationRelativeTo(null);

        colorThemeDark.addActionListener(new ThemeDark());
        colorThemeWarren.addActionListener(new ThemeWarren());
        colorThemePrimary.addActionListener(new ThemePrimary());

        panel.add(colorThemeDark);
        panel.add(colorThemeWarren);
        panel.add(colorThemePrimary);

        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color darkPanel = new Color(23, 5, 12);
            Color darkButton = new Color(26, 110, 16);
            Color darkText = new Color(255, 255, 255, 200);

            colorThemeDark.setBackground(darkButton);
            colorThemeDark.setForeground(darkText);
            colorThemeWarren.setBackground(darkButton);
            colorThemeWarren.setBackground(darkText);
            colorThemePrimary.setBackground(darkButton);
            colorThemePrimary.setBackground(darkText);
            panel.setBackground(darkPanel);
        }
    }
    private class ThemeWarren implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color warrenPanel = new Color(23, 5, 12);
            Color warrenButton = new Color(234, 170, 8);
            Color warrenText = new Color(255, 255, 255);

            colorThemeWarren.setBackground(warrenButton);
            colorThemeWarren.setBackground(warrenText);
            colorThemeDark.setBackground(warrenButton);
            colorThemeDark.setForeground(warrenText);
            colorThemePrimary.setBackground(warrenButton);
            colorThemePrimary.setBackground(warrenText);
            panel.setBackground(warrenPanel);
        }
    }

    private class ThemePrimary implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            colorThemePrimary.setBackground(Color.BLUE);
            colorThemePrimary.setBackground(Color.YELLOW);
            colorThemeWarren.setBackground(Color.BLUE);
            colorThemeWarren.setBackground(Color.YELLOW);
            colorThemeDark.setBackground(Color.BLUE);
            colorThemeDark.setForeground(Color.YELLOW);
        }
    }
}

