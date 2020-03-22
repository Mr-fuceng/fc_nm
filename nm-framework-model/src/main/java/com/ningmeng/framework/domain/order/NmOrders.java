package com.ningmeng.framework.domain.order;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data
@ToString
@Entity
@Table(name="nm_orders")
@GenericGenerator(name = "jpa-assigned", strategy = "assigned")
public class NmOrders implements Serializable {
    private static final long serialVersionUID = -916357210051689789L;
    @Id
    @GeneratedValue(generator = "jpa-assigned")
    @Column(name = "order_number",length = 32)
    private String orderNumber;
    @Column(name = "initial_price")
    private Float initialPrice;
    private Float price;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;
    private String status;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "details")
    private String details;

}
