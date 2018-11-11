package com.example.android.pets.data;

import android.net.Uri;
import android.content.ContentResolver;
import android.provider.BaseColumns;

public final class PetContract {
    private PetContract() {}
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = "pets";
    public static final class PetEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;
        public final static String TABLE_NAME = "pets";

        /**
         * Unique ID number for the pet.
         *
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PET_NAME ="name";

        /**
         * Breed of the pet.
         *
         * Type: TEXT
         */
        public final static String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet.
         *
         * Possible values are GENDER_UNKNOWN, GENDER_MALE or GENDER_FEMALE
         *
         * Type: INTEGER
         */
        public final static String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet.
         *
         * Type: INTEGER
         */
        public final static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        public static boolean isValidGender(int gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }
    }

}