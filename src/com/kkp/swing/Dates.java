package com.kkp.swing;

import com.kkp.event.Event;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;

public final class Dates extends javax.swing.JPanel {

    private Event event;
    private final int MONTH;
    private final int YEAR;
    private final int DAY;
    private int m;
    private int y;
    private int selectDay = 0;
    private int startDate;
    private int max_of_month;

    public Dates() {
        initComponents();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String toDay = df.format(date);
        DAY = Integer.valueOf(toDay.split("-")[0]);
        MONTH = Integer.valueOf(toDay.split("-")[1]);
        YEAR = Integer.valueOf(toDay.split("-")[2]);
    }

    public void showDate(int month, int year, SelectedDate select) {
        m = month;
        y = year;
        // selectDay = 0;
        Calendar cd = Calendar.getInstance();
        cd.set(year, month - 1, 1);
        int start = cd.get(Calendar.DAY_OF_WEEK);
        max_of_month = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (start == 1) {
            start += 7;
        }
        clear();
        start += 5;
        startDate = start;
        for (int i = 1; i <= max_of_month; i++) {
            ButtonDate cmd = (ButtonDate) getComponent(start);
            cmd.setColorSelected(getForeground());
            cmd.setText(i + "");
            if (i == DAY && month == MONTH && year == YEAR) {
                cmd.setBackground(new Color(224, 214, 229));
            } else {
                cmd.setBackground(Color.WHITE);
            }
            if (i == select.getDay() && month == select.getMonth() && year == select.getYear()) {
                cmd.setBackground(getForeground());
                cmd.setForeground(new Color(255, 255, 255));
            }
            start++;
        }
    }

    private void clear() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((JButton) getComponent(i)).setText("");
        }
    }

    public void clearSelected() {
        for (int i = 7; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            if (MONTH == m && y == YEAR && !cmd.getText().equals("") && Integer.valueOf(cmd.getText()) == DAY) {
                cmd.setBackground(new Color(224, 214, 229));
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            } else {
                cmd.setBackground(Color.WHITE);
                cmd.setForeground(new java.awt.Color(75, 75, 75));
            }
        }
        selectDay = 0;
    }

    private void addEvent() {
        for (int i = 7; i < getComponentCount(); i++) {
            ((ButtonDate) getComponent(i)).setEvent(event);
        }
    }

    public void setSelected(int index) {
        selectDay = index;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdSenin = new com.kkp.swing.ButtonDate();
        cmdSelasa = new com.kkp.swing.ButtonDate();
        cmdRabu = new com.kkp.swing.ButtonDate();
        cmdKamis = new com.kkp.swing.ButtonDate();
        cmdJumat = new com.kkp.swing.ButtonDate();
        cmdSabtu = new com.kkp.swing.ButtonDate();
        cmdMinggu = new com.kkp.swing.ButtonDate();
        cmd1 = new com.kkp.swing.ButtonDate();
        cm2 = new com.kkp.swing.ButtonDate();
        cmd3 = new com.kkp.swing.ButtonDate();
        cmd4 = new com.kkp.swing.ButtonDate();
        cmd5 = new com.kkp.swing.ButtonDate();
        cmd6 = new com.kkp.swing.ButtonDate();
        cmd8 = new com.kkp.swing.ButtonDate();
        cmd9 = new com.kkp.swing.ButtonDate();
        cmd10 = new com.kkp.swing.ButtonDate();
        cmd11 = new com.kkp.swing.ButtonDate();
        cmd12 = new com.kkp.swing.ButtonDate();
        cmd13 = new com.kkp.swing.ButtonDate();
        cmd14 = new com.kkp.swing.ButtonDate();
        cmd15 = new com.kkp.swing.ButtonDate();
        cmd16 = new com.kkp.swing.ButtonDate();
        cmd17 = new com.kkp.swing.ButtonDate();
        cmd18 = new com.kkp.swing.ButtonDate();
        cmd19 = new com.kkp.swing.ButtonDate();
        cmd20 = new com.kkp.swing.ButtonDate();
        cmd21 = new com.kkp.swing.ButtonDate();
        cmd22 = new com.kkp.swing.ButtonDate();
        cmd23 = new com.kkp.swing.ButtonDate();
        cmd24 = new com.kkp.swing.ButtonDate();
        cmd25 = new com.kkp.swing.ButtonDate();
        cmd26 = new com.kkp.swing.ButtonDate();
        cmd27 = new com.kkp.swing.ButtonDate();
        cmd28 = new com.kkp.swing.ButtonDate();
        cmd29 = new com.kkp.swing.ButtonDate();
        cmd30 = new com.kkp.swing.ButtonDate();
        cmd31 = new com.kkp.swing.ButtonDate();
        cmd32 = new com.kkp.swing.ButtonDate();
        cmd33 = new com.kkp.swing.ButtonDate();
        cmd34 = new com.kkp.swing.ButtonDate();
        cmd35 = new com.kkp.swing.ButtonDate();
        cmd36 = new com.kkp.swing.ButtonDate();
        cmd37 = new com.kkp.swing.ButtonDate();
        cmd38 = new com.kkp.swing.ButtonDate();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(7, 7));

        cmdSenin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdSenin.setForeground(new java.awt.Color(118, 118, 118));
        cmdSenin.setText("Sen");
        add(cmdSenin);

        cmdSelasa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdSelasa.setForeground(new java.awt.Color(118, 118, 118));
        cmdSelasa.setText("Sel");
        add(cmdSelasa);

        cmdRabu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdRabu.setForeground(new java.awt.Color(118, 118, 118));
        cmdRabu.setText("Rab");
        add(cmdRabu);

        cmdKamis.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdKamis.setForeground(new java.awt.Color(118, 118, 118));
        cmdKamis.setText("Kam");
        add(cmdKamis);

        cmdJumat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdJumat.setForeground(new java.awt.Color(118, 118, 118));
        cmdJumat.setText("Jum");
        add(cmdJumat);

        cmdSabtu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdSabtu.setForeground(new java.awt.Color(118, 118, 118));
        cmdSabtu.setText("Sab");
        cmdSabtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSabtuActionPerformed(evt);
            }
        });
        add(cmdSabtu);

        cmdMinggu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmdMinggu.setForeground(new java.awt.Color(255, 0, 0));
        cmdMinggu.setText("Min");
        add(cmdMinggu);
        add(cmd1);

        cm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm2ActionPerformed(evt);
            }
        });
        add(cm2);
        add(cmd3);

        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });
        add(cmd4);
        add(cmd5);
        add(cmd6);
        add(cmd8);

        cmd9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("1");
        add(cmd9);

        cmd10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("2");
        add(cmd10);

        cmd11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("3");
        add(cmd11);

        cmd12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("4");
        add(cmd12);

        cmd13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmd13.setForeground(new java.awt.Color(75, 75, 75));
        cmd13.setText("5");
        add(cmd13);

        cmd14.setForeground(new java.awt.Color(75, 75, 75));
        cmd14.setText("6");
        add(cmd14);

        cmd15.setForeground(new java.awt.Color(75, 75, 75));
        cmd15.setText("7");
        add(cmd15);

        cmd16.setForeground(new java.awt.Color(75, 75, 75));
        cmd16.setText("8");
        add(cmd16);

        cmd17.setForeground(new java.awt.Color(75, 75, 75));
        cmd17.setText("9");
        add(cmd17);

        cmd18.setForeground(new java.awt.Color(75, 75, 75));
        cmd18.setText("10");
        add(cmd18);

        cmd19.setForeground(new java.awt.Color(75, 75, 75));
        cmd19.setText("11");
        add(cmd19);

        cmd20.setForeground(new java.awt.Color(75, 75, 75));
        cmd20.setText("19");
        add(cmd20);

        cmd21.setForeground(new java.awt.Color(75, 75, 75));
        cmd21.setText("12");
        add(cmd21);

        cmd22.setForeground(new java.awt.Color(75, 75, 75));
        cmd22.setText("13");
        add(cmd22);

        cmd23.setForeground(new java.awt.Color(75, 75, 75));
        cmd23.setText("14");
        add(cmd23);

        cmd24.setForeground(new java.awt.Color(75, 75, 75));
        cmd24.setText("15");
        add(cmd24);

        cmd25.setForeground(new java.awt.Color(75, 75, 75));
        cmd25.setText("16");
        add(cmd25);

        cmd26.setForeground(new java.awt.Color(75, 75, 75));
        cmd26.setText("17");
        add(cmd26);

        cmd27.setForeground(new java.awt.Color(75, 75, 75));
        cmd27.setText("18");
        add(cmd27);

        cmd28.setForeground(new java.awt.Color(75, 75, 75));
        cmd28.setText("20");
        add(cmd28);

        cmd29.setForeground(new java.awt.Color(75, 75, 75));
        cmd29.setText("22");
        add(cmd29);

        cmd30.setForeground(new java.awt.Color(75, 75, 75));
        cmd30.setText("23");
        add(cmd30);

        cmd31.setForeground(new java.awt.Color(75, 75, 75));
        cmd31.setText("24");
        add(cmd31);

        cmd32.setForeground(new java.awt.Color(75, 75, 75));
        cmd32.setText("25");
        add(cmd32);

        cmd33.setForeground(new java.awt.Color(75, 75, 75));
        cmd33.setText("26");
        add(cmd33);

        cmd34.setForeground(new java.awt.Color(75, 75, 75));
        cmd34.setText("27");
        add(cmd34);

        cmd35.setForeground(new java.awt.Color(75, 75, 75));
        cmd35.setText("28");
        add(cmd35);

        cmd36.setForeground(new java.awt.Color(75, 75, 75));
        cmd36.setText("29");
        add(cmd36);

        cmd37.setForeground(new java.awt.Color(75, 75, 75));
        cmd37.setText("30");
        add(cmd37);

        cmd38.setForeground(new java.awt.Color(75, 75, 75));
        cmd38.setText("31");
        add(cmd38);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cm2ActionPerformed

    private void cmdSabtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSabtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSabtuActionPerformed

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kkp.swing.ButtonDate cm2;
    private com.kkp.swing.ButtonDate cmd1;
    private com.kkp.swing.ButtonDate cmd10;
    private com.kkp.swing.ButtonDate cmd11;
    private com.kkp.swing.ButtonDate cmd12;
    private com.kkp.swing.ButtonDate cmd13;
    private com.kkp.swing.ButtonDate cmd14;
    private com.kkp.swing.ButtonDate cmd15;
    private com.kkp.swing.ButtonDate cmd16;
    private com.kkp.swing.ButtonDate cmd17;
    private com.kkp.swing.ButtonDate cmd18;
    private com.kkp.swing.ButtonDate cmd19;
    private com.kkp.swing.ButtonDate cmd20;
    private com.kkp.swing.ButtonDate cmd21;
    private com.kkp.swing.ButtonDate cmd22;
    private com.kkp.swing.ButtonDate cmd23;
    private com.kkp.swing.ButtonDate cmd24;
    private com.kkp.swing.ButtonDate cmd25;
    private com.kkp.swing.ButtonDate cmd26;
    private com.kkp.swing.ButtonDate cmd27;
    private com.kkp.swing.ButtonDate cmd28;
    private com.kkp.swing.ButtonDate cmd29;
    private com.kkp.swing.ButtonDate cmd3;
    private com.kkp.swing.ButtonDate cmd30;
    private com.kkp.swing.ButtonDate cmd31;
    private com.kkp.swing.ButtonDate cmd32;
    private com.kkp.swing.ButtonDate cmd33;
    private com.kkp.swing.ButtonDate cmd34;
    private com.kkp.swing.ButtonDate cmd35;
    private com.kkp.swing.ButtonDate cmd36;
    private com.kkp.swing.ButtonDate cmd37;
    private com.kkp.swing.ButtonDate cmd38;
    private com.kkp.swing.ButtonDate cmd4;
    private com.kkp.swing.ButtonDate cmd5;
    private com.kkp.swing.ButtonDate cmd6;
    private com.kkp.swing.ButtonDate cmd8;
    private com.kkp.swing.ButtonDate cmd9;
    private com.kkp.swing.ButtonDate cmdJumat;
    private com.kkp.swing.ButtonDate cmdKamis;
    private com.kkp.swing.ButtonDate cmdMinggu;
    private com.kkp.swing.ButtonDate cmdRabu;
    private com.kkp.swing.ButtonDate cmdSabtu;
    private com.kkp.swing.ButtonDate cmdSelasa;
    private com.kkp.swing.ButtonDate cmdSenin;
    // End of variables declaration//GEN-END:variables

    public void next() {
        if (selectDay == max_of_month) {
            selectDay = 0;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 1);
        String n = cmd.getText();
        if (!n.equals("") && Integer.valueOf(n) <= max_of_month) {
            selectDay++;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void back() {
        if (selectDay <= 1) {
            selectDay = max_of_month + 1;
        }
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 1);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay--;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void up() {
        JButton cmd = (JButton) getComponent(startDate - 1 + selectDay - 7);
        String n = cmd.getText();
        if (!n.equals("") && cmd.getName() != null) {
            selectDay -= 7;
            event.execute(null, selectDay);
            cmd.setBackground(new Color(206, 110, 245));
        }
    }

    public void down() {
        if (getComponents().length > startDate - 1 + selectDay + 7) {
            JButton cmd = (JButton) getComponent(startDate - 1 + selectDay + 7);
            String n = cmd.getText();
            if (!n.equals("") && cmd.getName() != null) {
                selectDay += 7;
                event.execute(null, selectDay);
                cmd.setBackground(new Color(206, 110, 245));
            }
        }
    }

}
