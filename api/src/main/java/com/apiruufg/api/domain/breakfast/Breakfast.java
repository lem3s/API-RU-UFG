package com.apiruufg.api.domain.breakfast;

import com.apiruufg.api.domain.menu.Menu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "breakfasts")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Breakfast {
    @Id
    @GeneratedValue
    private UUID id;

    private String milk;

    private String veganComplement;

    private String complement;

    private String fruit;

    private String coffeeTea;

    private String breadsGrocery;

    private String veganVegetableDrink;

    private String veganGrocery;

    @OneToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
