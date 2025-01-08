ALTER TABLE lunches DROP CONSTRAINT lunches_menu_id_fkey;

ALTER TABLE lunches
    ADD CONSTRAINT lunches_menu_id_fkey
        FOREIGN KEY (menu_id)
            REFERENCES menus(id);