package com.nt.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "ORDER_DTLS")
@Data
public class OrderDtlsEntity {
	
	@Id
	@Column(name = "ORDER_ID")
	@GenericGenerator(name = "order_id_gen" , strategy ="com.nt.generator.OrderDtlsGenerator" )
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;
	
	@Column(name = "ORDER_PLACE_BY")
	private String orderPlaceBy;
	
	@Column(name = "ORDER_DATE")
	private Date orderDate;

}
