package de.punn.monopoly.model.street;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class HooverDam extends Street{

    public static final int POSITION = 37;
    public static final BigDecimal PURCHASE_PRICE = BigDecimal.valueOf(350L);
    public static final BigDecimal RENT = BigDecimal.valueOf(70L);
    public static final PropertyColor PROPERTY_COLOR = PropertyColor.BLUE;

    public HooverDam() {
        this.rent = HooverDam.RENT;
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
        return HooverDam.class.getSimpleName();
    }
}
