/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Khachhang;
import model.Loaitietkiem;
import model.Sotietkiem;
import org.hibernate.SessionFactory;

/**
 * FXML Controller class
 *
 * @author vinh
 */
public class SoTietKiemController implements Initializable {

    private SessionFactory factory;
    private ObservableList<Sotietkiem> idstk;
    @FXML
    private TextField txtMaSoTietKiem;
    @FXML
    private TextField txtSoTienGui;
    @FXML
    private Label lblTongTien;
    @FXML
    private TextField txtLoaiTien;
    @FXML
    private DatePicker dpNgayMo;
    @FXML
    private DatePicker dpNgayTinhLai;
    @FXML
    private DatePicker dpNgayDenHan;
    @FXML
    private ComboBox<Khachhang> cbMaKhachHang;
    @FXML
    private ComboBox<Loaitietkiem> cbMaLoaiTietKiem;
    @FXML
    private CheckBox ckbDongSo;
    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
