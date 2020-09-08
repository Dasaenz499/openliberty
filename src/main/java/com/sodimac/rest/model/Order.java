
package com.sodimac.rest.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class Order {

	private String channel;
	private String commerce;
	private Customer customer;
	private BigDecimal id;
	private BigDecimal idStore;
	private String cmr;
	private List<Item> items;
	private List<Shipment> shipments;
	private String observations;
	private String idReservations;
	private BigDecimal transportationPrice;
	private PersonReceives personReceives;
	private BigDecimal total;
	private String origin;
	private List<PaymentMethod> paymentMethods;
	private List<String> authorizationsDne;
	private Authorization authorization;
	private BigDecimal idSalesFinance;
	private String[] extraParams;
	private boolean modification;
	private BigDecimal identificationEmployee;
	private List<ItemS> itemSpecials;
	private List<DetalleLeadModel> detallesLead;
	private HistoricoEstadoLeadModel historicoLead;
	private NotaLeadModel notaLead;
	private List<ServicioNotaLeadModel> serviciosLead;
	private List<AuditoriaPrecioPromocion> auditoriaPrecios;
	private CashBackBonus cashBackBonus;
}

