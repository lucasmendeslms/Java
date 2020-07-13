package modulos;

import modulos.enums.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.text.NumberFormat;

public class Order {

    private static final SimpleDateFormat dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, Client client, OrderStatus status) {
        this.moment = moment;
        this.client = client;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double valorTotal = 0;
        for (OrderItem mercadoria : items) {
            valorTotal += mercadoria.subTotal();
        }

        return valorTotal;

    }

    public String toString() {
        StringBuilder ped = new StringBuilder();
        ped.append("Data e hora do pedido: ");
        ped.append(dataHora.format(moment) + "\n\n");
        ped.append("Status do pedido: ");
        ped.append(status + "\n\n");
        ped.append("Cliente: ");
        ped.append(client + "\n\n");
        ped.append("\nItens do pedido:\n\n");
        for (OrderItem item : items) {
            ped.append(item + "\n\n");
        }
        ped.append("\nPreço total do pedido: ");
        ped.append(NumberFormat.getCurrencyInstance().format(total()));

        return ped.toString();

    }
}