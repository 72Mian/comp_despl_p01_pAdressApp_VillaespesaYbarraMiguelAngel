package es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel.view;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class PieCharStatisticsController {



    @FXML
    private PieChart pieChart;



    public void setPersonData(List<Person> persons) {

        // ---------------------------------------------------
        // LÓGICA 2: GENERACIONES (Para PieChart)
        // ---------------------------------------------------
        updatePieChartData(persons);
    }

    /**
     * Método auxiliar para calcular y mostrar las generaciones
     */
    private void updatePieChartData(List<Person> persons) {
        int boomers = 0;
        int genX = 0;
        int millennials = 0;
        int genZ = 0;
        int alpha = 0;

        for (Person p : persons) {
            int year = p.getBirthday().getYear();

            if (year <= 1964) {
                boomers++;
            } else if (year <= 1980) {
                genX++;
            } else if (year <= 1996) {
                millennials++;
            } else if (year <= 2012) {
                genZ++;
            } else {
                alpha++;
            }
        }

        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList();

        // Solo añadimos al gráfico las generaciones que tengan al menos 1 persona
        // para evitar etiquetas vacías.
        if (boomers > 0)     pieData.add(new PieChart.Data("Baby Boomers", boomers));
        if (genX > 0)        pieData.add(new PieChart.Data("Gen X", genX));
        if (millennials > 0) pieData.add(new PieChart.Data("Millennials", millennials));
        if (genZ > 0)        pieData.add(new PieChart.Data("Gen Z", genZ));
        if (alpha > 0)       pieData.add(new PieChart.Data("Gen Alpha", alpha));

        pieChart.setData(pieData);
        pieChart.setTitle("Distribución por Generaciones");
    }
}