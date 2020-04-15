package com.sm.fsm.model.entity;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_coupon")
public class Coupon extends AbstractEntity {

}
