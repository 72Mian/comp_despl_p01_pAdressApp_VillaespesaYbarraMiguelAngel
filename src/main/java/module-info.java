module es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires java.prefs;
    opens es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel.model;
    opens es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel.persistence;
    opens es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel.util;
    opens es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel.view;
    opens es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel to javafx.fxml;
    exports es.damdi.miguelangel.comp_despl_p01_padressapp_villaespesaybarramiguelangel;
}