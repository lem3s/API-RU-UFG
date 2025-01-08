CREATE TABLE dinners (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    protein_dish VARCHAR(250),
    ovolactovegetarian_option VARCHAR(250),
    vegan_option VARCHAR(250),
    side_dishes VARCHAR(250),
    rice VARCHAR(250),
    beans VARCHAR(250),
    salad VARCHAR(250),
    refreshment VARCHAR(250),
    desert VARCHAR(250),
    menu_id UUID,
    FOREIGN KEY (menu_id) REFERENCES menus(id) ON DELETE CASCADE
);
