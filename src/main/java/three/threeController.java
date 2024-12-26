package three;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class threeController {
    @FXML
    private CheckBox steakCheck, spaghettiCheck, soupCheck, cheesecakeCheck;
    @FXML
    private TextField steakQuantity, spaghettiQuantity, soupQuantity, cheesecakeQuantity;

    @FXML
    private void placeOrder() {
        StringBuilder orderSummary = new StringBuilder("Чек заказа:\n");
        double total = 0;
        int totalQuantity = 0;

        if (steakCheck.isSelected()) {
            String inputValue = steakQuantity.getText();
            double price = 899;
            if (inputValue.isEmpty()) {
                int quantity = 1;
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Стейк: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            } else {
                int quantity = Integer.parseInt(inputValue);
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Стейк: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            }
        }
        if (spaghettiCheck.isSelected()) {
            double price = 599;
            String inputValue = spaghettiQuantity.getText();
            if (inputValue.isEmpty()) {
                int quantity = 1;
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Спагетти: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            } else {
                int quantity = Integer.parseInt(inputValue);
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Спагетти: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            }
        }
        if (soupCheck.isSelected()) {
            double price = 599;
            String inputValue = soupQuantity.getText();
            if (inputValue.isEmpty()) {
                int quantity = 1;
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Суп: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            } else {
                int quantity = Integer.parseInt(inputValue);
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Суп: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            }
        }
        if (cheesecakeCheck.isSelected()) {
            double price = 449;
            String inputValue = cheesecakeQuantity.getText();
            if (inputValue.isEmpty()) {
                int quantity = 1;
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Чизкейк: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            } else {
                int quantity = Integer.parseInt(inputValue);
                totalQuantity += quantity;
                double cost = quantity * price;
                total += cost;
                orderSummary.append("Чизкейк: ").append(quantity).append(" шт., Цена: ").append(cost).append("\n");
            }
        }

        orderSummary.append("Общая стоимость: ").append(total);

        if (totalQuantity > 25) {
            orderSummary.append("\nА вы не лопните?)");
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Чек");
        alert.setHeaderText(null);
        alert.setContentText(orderSummary.toString());
        alert.setContentText(orderSummary.toString());
        alert.showAndWait();
    }
}