package com.apiruufg.api.domain.dinner;

import com.apiruufg.api.domain.menu.Menu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "dinners")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dinner {
    @Id
    @GeneratedValue
    private UUID id;

    private String proteinDish;

    private String ovolactovegetarianOption;

    private String veganOption;

    private String sideDishes;

    private String rice;

    private String beans;

    private String salad;

    private String refreshment;

    private String desert;

    @OneToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}
