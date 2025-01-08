CREATE TABLE breakfasts (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    milk VARCHAR(250),
    vegan_complement VARCHAR(250),
    complement VARCHAR(250),
    fruit VARCHAR(250),
    rice VARCHAR(250),
    coffee_tea VARCHAR(250),
    breads_grocery VARCHAR(250),
    vegan_vegetable_drink VARCHAR(250),
    vegan_grocery VARCHAR(250),
    menu_id UUID,
    FOREIGN KEY (menu_id) REFERENCES menus(id) ON DELETE CASCADE
);
