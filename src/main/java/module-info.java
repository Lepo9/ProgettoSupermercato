module leporati.marco.progettosupermercato {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens sk.llpc.progettosupermercato to javafx.fxml;
    exports sk.llpc.progettosupermercato;
}