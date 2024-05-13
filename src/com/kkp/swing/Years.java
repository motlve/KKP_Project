package com.kkp.swing;

import com.kkp.event.Event;
import javax.swing.JButton;

public final class Years extends javax.swing.JPanel {

    private Event event;
    private int startYear;

    public Years() {
        initComponents();
    }

    public int showYear(int year) {
        year = calculateYear(year);
        for (int i = 0; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            cmd.setText(year + "");
            year++;
        }
        return startYear;
    }

    private int calculateYear(int year) {
        year -= year % 10;
        startYear = year;
        return year;
    }

    private void addEvent() {
        for (int i = 0; i < getComponentCount(); i++) {
            ((ButtonDate) getComponent(i)).setEvent(event);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonDate15 = new com.kkp.swing.ButtonDate();
        buttonDate1 = new com.kkp.swing.ButtonDate();
        buttonDate2 = new com.kkp.swing.ButtonDate();
        buttonDate3 = new com.kkp.swing.ButtonDate();
        buttonDate6 = new com.kkp.swing.ButtonDate();
        buttonDate17 = new com.kkp.swing.ButtonDate();
        buttonDate4 = new com.kkp.swing.ButtonDate();
        buttonDate8 = new com.kkp.swing.ButtonDate();
        buttonDate7 = new com.kkp.swing.ButtonDate();
        buttonDate12 = new com.kkp.swing.ButtonDate();
        buttonDate11 = new com.kkp.swing.ButtonDate();
        buttonDate13 = new com.kkp.swing.ButtonDate();
        buttonDate10 = new com.kkp.swing.ButtonDate();
        buttonDate9 = new com.kkp.swing.ButtonDate();
        buttonDate20 = new com.kkp.swing.ButtonDate();
        buttonDate19 = new com.kkp.swing.ButtonDate();
        buttonDate18 = new com.kkp.swing.ButtonDate();
        buttonDate5 = new com.kkp.swing.ButtonDate();
        buttonDate14 = new com.kkp.swing.ButtonDate();
        buttonDate16 = new com.kkp.swing.ButtonDate();
        buttonDate21 = new com.kkp.swing.ButtonDate();

        buttonDate15.setText("buttonDate15");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(5, 4));

        buttonDate1.setText("2024");
        add(buttonDate1);

        buttonDate2.setText("2025");
        add(buttonDate2);

        buttonDate3.setText("2026");
        add(buttonDate3);

        buttonDate6.setText("2027");
        add(buttonDate6);

        buttonDate17.setText("2028");
        add(buttonDate17);

        buttonDate4.setText("2029");
        add(buttonDate4);

        buttonDate8.setText("2030");
        add(buttonDate8);

        buttonDate7.setText("2031");
        add(buttonDate7);

        buttonDate12.setText("2032");
        add(buttonDate12);

        buttonDate11.setText("2033");
        add(buttonDate11);

        buttonDate13.setText("2034");
        add(buttonDate13);

        buttonDate10.setText("2035");
        add(buttonDate10);

        buttonDate9.setText("2036");
        add(buttonDate9);

        buttonDate20.setText("2037");
        add(buttonDate20);

        buttonDate19.setText("2038");
        add(buttonDate19);

        buttonDate18.setText("2039");
        add(buttonDate18);

        buttonDate5.setText("2040");
        add(buttonDate5);

        buttonDate14.setText("2041");
        add(buttonDate14);

        buttonDate16.setText("2042");
        add(buttonDate16);

        buttonDate21.setText("2043");
        add(buttonDate21);
    }// </editor-fold>//GEN-END:initComponents

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    public int next(int year) {
        showYear(year + 20);
        return startYear;
    }

    public int back(int year) {
        showYear(year - 20);
        return startYear;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kkp.swing.ButtonDate buttonDate1;
    private com.kkp.swing.ButtonDate buttonDate10;
    private com.kkp.swing.ButtonDate buttonDate11;
    private com.kkp.swing.ButtonDate buttonDate12;
    private com.kkp.swing.ButtonDate buttonDate13;
    private com.kkp.swing.ButtonDate buttonDate14;
    private com.kkp.swing.ButtonDate buttonDate15;
    private com.kkp.swing.ButtonDate buttonDate16;
    private com.kkp.swing.ButtonDate buttonDate17;
    private com.kkp.swing.ButtonDate buttonDate18;
    private com.kkp.swing.ButtonDate buttonDate19;
    private com.kkp.swing.ButtonDate buttonDate2;
    private com.kkp.swing.ButtonDate buttonDate20;
    private com.kkp.swing.ButtonDate buttonDate21;
    private com.kkp.swing.ButtonDate buttonDate3;
    private com.kkp.swing.ButtonDate buttonDate4;
    private com.kkp.swing.ButtonDate buttonDate5;
    private com.kkp.swing.ButtonDate buttonDate6;
    private com.kkp.swing.ButtonDate buttonDate7;
    private com.kkp.swing.ButtonDate buttonDate8;
    private com.kkp.swing.ButtonDate buttonDate9;
    // End of variables declaration//GEN-END:variables

}
