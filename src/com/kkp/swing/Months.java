package com.kkp.swing;

import com.kkp.event.Event;

public final class Months extends javax.swing.JPanel {

    private Event event;
    private int m;

    public Months() {
        initComponents();
    }

    private void addEvent() {
        for (int i = 0; i < getComponentCount(); i++) {
            ((ButtonDate) getComponent(i)).setEvent(event);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonDate1 = new com.kkp.swing.ButtonDate();
        cmd1 = new com.kkp.swing.ButtonDate();
        cmd2 = new com.kkp.swing.ButtonDate();
        cmd3 = new com.kkp.swing.ButtonDate();
        cmd4 = new com.kkp.swing.ButtonDate();
        cmd5 = new com.kkp.swing.ButtonDate();
        cmd6 = new com.kkp.swing.ButtonDate();
        cmd7 = new com.kkp.swing.ButtonDate();
        cmd8 = new com.kkp.swing.ButtonDate();
        cmd9 = new com.kkp.swing.ButtonDate();
        cmd10 = new com.kkp.swing.ButtonDate();
        cmd11 = new com.kkp.swing.ButtonDate();
        cmd12 = new com.kkp.swing.ButtonDate();

        buttonDate1.setText("buttonDate1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(4, 4));

        cmd1.setText("Januari");
        add(cmd1);

        cmd2.setText("Februari");
        add(cmd2);

        cmd3.setText("Maret");
        add(cmd3);

        cmd4.setText("April");
        add(cmd4);

        cmd5.setText("Mei");
        add(cmd5);

        cmd6.setText("Juni");
        add(cmd6);

        cmd7.setText("Juli");
        add(cmd7);

        cmd8.setText("Agustus");
        add(cmd8);

        cmd9.setText("September");
        add(cmd9);

        cmd10.setText("Oktober");
        add(cmd10);

        cmd11.setText("November");
        add(cmd11);

        cmd12.setText("Desember");
        add(cmd12);
    }// </editor-fold>//GEN-END:initComponents

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kkp.swing.ButtonDate buttonDate1;
    private com.kkp.swing.ButtonDate cmd1;
    private com.kkp.swing.ButtonDate cmd10;
    private com.kkp.swing.ButtonDate cmd11;
    private com.kkp.swing.ButtonDate cmd12;
    private com.kkp.swing.ButtonDate cmd2;
    private com.kkp.swing.ButtonDate cmd3;
    private com.kkp.swing.ButtonDate cmd4;
    private com.kkp.swing.ButtonDate cmd5;
    private com.kkp.swing.ButtonDate cmd6;
    private com.kkp.swing.ButtonDate cmd7;
    private com.kkp.swing.ButtonDate cmd8;
    private com.kkp.swing.ButtonDate cmd9;
    // End of variables declaration//GEN-END:variables

}
