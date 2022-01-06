package de.punn.monopoly.model.street;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Freeside extends Street{

    public static final int POSITION = 14;
    public static final BigDecimal PURCHASE_PRICE = BigDecimal.valueOf(160L);
    public static final BigDecimal RENT = BigDecimal.valueOf(12L);
    public static final PropertyColor PROPERTY_COLOR = PropertyColor.PINK;

    public Freeside() {
        this.rent = Freeside.RENT;
    }

    @Override
    public BigDecimal getPurchasePrice() {
        return PURCHASE_PRICE;
    }

    @Override
    public int getSquarePosition() {
        return POSITION;
    }

    @Override
    public PropertyColor getPropertyColor() {
        return PROPERTY_COLOR;
    }

    @Override
    public String getName() {
        return Freeside.class.getSimpleName();
    }
}
