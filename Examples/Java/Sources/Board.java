//
// Board.java
// Autogenerated by plank
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

package com.pinterest.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Board {

    public static final String TYPE = "board";

    @SerializedName("id") private @Nullable String uid;
    @SerializedName("contributors") private @Nullable Set<User> contributors;
    @SerializedName("counts") private @Nullable Map<String, Integer> counts;
    @SerializedName("created_at") private @Nullable Date createdAt;
    @SerializedName("creator") private @Nullable Map<String, String> creator;
    @SerializedName("creator_url") private @Nullable String creatorURL;
    @SerializedName("description") private @Nullable String description;
    @SerializedName("image") private @NonNull Image image;
    @SerializedName("name") private @Nullable String name;
    @SerializedName("url") private @Nullable String url;

    static final private int ID_INDEX = 0;
    static final private int CONTRIBUTORS_INDEX = 1;
    static final private int COUNTS_INDEX = 2;
    static final private int CREATED_AT_INDEX = 3;
    static final private int CREATOR_INDEX = 4;
    static final private int CREATOR_URL_INDEX = 5;
    static final private int DESCRIPTION_INDEX = 6;
    static final private int IMAGE_INDEX = 7;
    static final private int NAME_INDEX = 8;
    static final private int URL_INDEX = 9;

    private boolean[] _bits = new boolean[10];

    private Board(
        @Nullable String uid,
        @Nullable Set<User> contributors,
        @Nullable Map<String, Integer> counts,
        @Nullable Date createdAt,
        @Nullable Map<String, String> creator,
        @Nullable String creatorURL,
        @Nullable String description,
        @NonNull Image image,
        @Nullable String name,
        @Nullable String url,
        boolean[] _bits
    ) {
        this.uid = uid;
        this.contributors = contributors;
        this.counts = counts;
        this.createdAt = createdAt;
        this.creator = creator;
        this.creatorURL = creatorURL;
        this.description = description;
        this.image = image;
        this.name = name;
        this.url = url;
        this._bits = _bits;
    }

    public static Board.Builder builder() {
        return new Board.Builder();
    }

    public Board.Builder toBuilder() {
        return new Board.Builder(this);
    }

    public Board mergeFrom(Board model) {
        Board.Builder builder = this.toBuilder();
        builder.mergeFrom(model);
        return builder.build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Board that = (Board) o;
        return Objects.equals(this.uid, that.uid) &&
        Objects.equals(this.contributors, that.contributors) &&
        Objects.equals(this.counts, that.counts) &&
        Objects.equals(this.createdAt, that.createdAt) &&
        Objects.equals(this.creator, that.creator) &&
        Objects.equals(this.creatorURL, that.creatorURL) &&
        Objects.equals(this.description, that.description) &&
        Objects.equals(this.image, that.image) &&
        Objects.equals(this.name, that.name) &&
        Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid,
        contributors,
        counts,
        createdAt,
        creator,
        creatorURL,
        description,
        image,
        name,
        url);
    }

    public @Nullable String getUid() {
        return this.uid;
    }

    public @Nullable Set<User> getContributors() {
        return this.contributors;
    }

    public @Nullable Map<String, Integer> getCounts() {
        return this.counts;
    }

    public @Nullable Date getCreatedAt() {
        return this.createdAt;
    }

    public @Nullable Map<String, String> getCreator() {
        return this.creator;
    }

    public @Nullable String getCreatorURL() {
        return this.creatorURL;
    }

    public @Nullable String getDescription() {
        return this.description;
    }

    public @NonNull Image getImage() {
        return this.image;
    }

    public @Nullable String getName() {
        return this.name;
    }

    public @Nullable String getUrl() {
        return this.url;
    }

    public boolean getUidIsSet() {
        return this._bits.length > ID_INDEX && this._bits[ID_INDEX];
    }

    public boolean getContributorsIsSet() {
        return this._bits.length > CONTRIBUTORS_INDEX && this._bits[CONTRIBUTORS_INDEX];
    }

    public boolean getCountsIsSet() {
        return this._bits.length > COUNTS_INDEX && this._bits[COUNTS_INDEX];
    }

    public boolean getCreatedAtIsSet() {
        return this._bits.length > CREATED_AT_INDEX && this._bits[CREATED_AT_INDEX];
    }

    public boolean getCreatorIsSet() {
        return this._bits.length > CREATOR_INDEX && this._bits[CREATOR_INDEX];
    }

    public boolean getCreatorURLIsSet() {
        return this._bits.length > CREATOR_URL_INDEX && this._bits[CREATOR_URL_INDEX];
    }

    public boolean getDescriptionIsSet() {
        return this._bits.length > DESCRIPTION_INDEX && this._bits[DESCRIPTION_INDEX];
    }

    public boolean getImageIsSet() {
        return this._bits.length > IMAGE_INDEX && this._bits[IMAGE_INDEX];
    }

    public boolean getNameIsSet() {
        return this._bits.length > NAME_INDEX && this._bits[NAME_INDEX];
    }

    public boolean getUrlIsSet() {
        return this._bits.length > URL_INDEX && this._bits[URL_INDEX];
    }

    public static class Builder {

        private @Nullable String uid;
        private @Nullable Set<User> contributors;
        private @Nullable Map<String, Integer> counts;
        private @Nullable Date createdAt;
        private @Nullable Map<String, String> creator;
        private @Nullable String creatorURL;
        private @Nullable String description;
        private @NonNull Image image;
        private @Nullable String name;
        private @Nullable String url;

        private boolean[] _bits = new boolean[10];

        private Builder() {
        }

        private Builder(@NonNull Board model) {
            this.uid = model.uid;
            this.contributors = model.contributors;
            this.counts = model.counts;
            this.createdAt = model.createdAt;
            this.creator = model.creator;
            this.creatorURL = model.creatorURL;
            this.description = model.description;
            this.image = model.image;
            this.name = model.name;
            this.url = model.url;
            this._bits = model._bits;
        }

        public Builder setUid(@Nullable String value) {
            this.uid = value;
            if (this._bits.length > ID_INDEX) {
                this._bits[ID_INDEX] = true;
            }
            return this;
        }

        public Builder setContributors(@Nullable Set<User> value) {
            this.contributors = value;
            if (this._bits.length > CONTRIBUTORS_INDEX) {
                this._bits[CONTRIBUTORS_INDEX] = true;
            }
            return this;
        }

        public Builder setCounts(@Nullable Map<String, Integer> value) {
            this.counts = value;
            if (this._bits.length > COUNTS_INDEX) {
                this._bits[COUNTS_INDEX] = true;
            }
            return this;
        }

        public Builder setCreatedAt(@Nullable Date value) {
            this.createdAt = value;
            if (this._bits.length > CREATED_AT_INDEX) {
                this._bits[CREATED_AT_INDEX] = true;
            }
            return this;
        }

        public Builder setCreator(@Nullable Map<String, String> value) {
            this.creator = value;
            if (this._bits.length > CREATOR_INDEX) {
                this._bits[CREATOR_INDEX] = true;
            }
            return this;
        }

        public Builder setCreatorURL(@Nullable String value) {
            this.creatorURL = value;
            if (this._bits.length > CREATOR_URL_INDEX) {
                this._bits[CREATOR_URL_INDEX] = true;
            }
            return this;
        }

        public Builder setDescription(@Nullable String value) {
            this.description = value;
            if (this._bits.length > DESCRIPTION_INDEX) {
                this._bits[DESCRIPTION_INDEX] = true;
            }
            return this;
        }

        public Builder setImage(@NonNull Image value) {
            this.image = value;
            if (this._bits.length > IMAGE_INDEX) {
                this._bits[IMAGE_INDEX] = true;
            }
            return this;
        }

        public Builder setName(@Nullable String value) {
            this.name = value;
            if (this._bits.length > NAME_INDEX) {
                this._bits[NAME_INDEX] = true;
            }
            return this;
        }

        public Builder setUrl(@Nullable String value) {
            this.url = value;
            if (this._bits.length > URL_INDEX) {
                this._bits[URL_INDEX] = true;
            }
            return this;
        }

        public @Nullable String getUid() {
            return this.uid;
        }

        public @Nullable Set<User> getContributors() {
            return this.contributors;
        }

        public @Nullable Map<String, Integer> getCounts() {
            return this.counts;
        }

        public @Nullable Date getCreatedAt() {
            return this.createdAt;
        }

        public @Nullable Map<String, String> getCreator() {
            return this.creator;
        }

        public @Nullable String getCreatorURL() {
            return this.creatorURL;
        }

        public @Nullable String getDescription() {
            return this.description;
        }

        public @NonNull Image getImage() {
            return this.image;
        }

        public @Nullable String getName() {
            return this.name;
        }

        public @Nullable String getUrl() {
            return this.url;
        }

        @NonNull
        public Board build() {
            return new Board(
            this.uid,
            this.contributors,
            this.counts,
            this.createdAt,
            this.creator,
            this.creatorURL,
            this.description,
            this.image,
            this.name,
            this.url,
            this._bits
            );
        }

        public void mergeFrom(Board model) {
            if (model.getUidIsSet()) {
                this.uid = model.uid;
                if (this._bits.length > ID_INDEX) {
                    this._bits[ID_INDEX] = true;
                }
            }
            if (model.getContributorsIsSet()) {
                this.contributors = model.contributors;
                if (this._bits.length > CONTRIBUTORS_INDEX) {
                    this._bits[CONTRIBUTORS_INDEX] = true;
                }
            }
            if (model.getCountsIsSet()) {
                this.counts = model.counts;
                if (this._bits.length > COUNTS_INDEX) {
                    this._bits[COUNTS_INDEX] = true;
                }
            }
            if (model.getCreatedAtIsSet()) {
                this.createdAt = model.createdAt;
                if (this._bits.length > CREATED_AT_INDEX) {
                    this._bits[CREATED_AT_INDEX] = true;
                }
            }
            if (model.getCreatorIsSet()) {
                this.creator = model.creator;
                if (this._bits.length > CREATOR_INDEX) {
                    this._bits[CREATOR_INDEX] = true;
                }
            }
            if (model.getCreatorURLIsSet()) {
                this.creatorURL = model.creatorURL;
                if (this._bits.length > CREATOR_URL_INDEX) {
                    this._bits[CREATOR_URL_INDEX] = true;
                }
            }
            if (model.getDescriptionIsSet()) {
                this.description = model.description;
                if (this._bits.length > DESCRIPTION_INDEX) {
                    this._bits[DESCRIPTION_INDEX] = true;
                }
            }
            if (model.getImageIsSet()) {
                this.image = model.image;
                if (this._bits.length > IMAGE_INDEX) {
                    this._bits[IMAGE_INDEX] = true;
                }
            }
            if (model.getNameIsSet()) {
                this.name = model.name;
                if (this._bits.length > NAME_INDEX) {
                    this._bits[NAME_INDEX] = true;
                }
            }
            if (model.getUrlIsSet()) {
                this.url = model.url;
                if (this._bits.length > URL_INDEX) {
                    this._bits[URL_INDEX] = true;
                }
            }
        }
    }

    public static class BoardTypeAdapterFactory implements TypeAdapterFactory {

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (!Board.class.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return (TypeAdapter<T>) new BoardTypeAdapter(gson, this, typeToken);
        }
    }

    public static class BoardTypeAdapter extends TypeAdapter<Board> {

        final private BoardTypeAdapterFactory factory;
        final private Gson gson;
        final private TypeToken typeToken;
        private TypeAdapter<Board> delegateTypeAdapter;

        private TypeAdapter<Date> dateTypeAdapter;
        private TypeAdapter<Image> imageTypeAdapter;
        private TypeAdapter<Map<String, Integer>> map_String__Integer_TypeAdapter;
        private TypeAdapter<Map<String, String>> map_String__String_TypeAdapter;
        private TypeAdapter<Set<User>> set_User_TypeAdapter;
        private TypeAdapter<String> stringTypeAdapter;

        public BoardTypeAdapter(Gson gson, BoardTypeAdapterFactory factory, TypeToken typeToken) {
            this.factory = factory;
            this.gson = gson;
            this.typeToken = typeToken;
        }

        @Override
        public void write(JsonWriter writer, Board value) throws IOException {
            if (this.delegateTypeAdapter == null) {
                this.delegateTypeAdapter = this.gson.getDelegateAdapter(this.factory, this.typeToken);
            }
            writer.setSerializeNulls(false);
            this.delegateTypeAdapter.write(writer, value);
        }

        @Override
        public Board read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            Builder builder = Board.builder();
            boolean[] bits = null;
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case ("id"):
                        if (this.stringTypeAdapter == null) {
                            this.stringTypeAdapter = this.gson.getAdapter(String.class).nullSafe();
                        }
                        builder.setUid(this.stringTypeAdapter.read(reader));
                        break;
                    case ("contributors"):
                        if (this.set_User_TypeAdapter == null) {
                            this.set_User_TypeAdapter = this.gson.getAdapter(new TypeToken<Set<User>>(){}).nullSafe();
                        }
                        builder.setContributors(this.set_User_TypeAdapter.read(reader));
                        break;
                    case ("counts"):
                        if (this.map_String__Integer_TypeAdapter == null) {
                            this.map_String__Integer_TypeAdapter = this.gson.getAdapter(new TypeToken<Map<String, Integer>>(){}).nullSafe();
                        }
                        builder.setCounts(this.map_String__Integer_TypeAdapter.read(reader));
                        break;
                    case ("created_at"):
                        if (this.dateTypeAdapter == null) {
                            this.dateTypeAdapter = this.gson.getAdapter(Date.class).nullSafe();
                        }
                        builder.setCreatedAt(this.dateTypeAdapter.read(reader));
                        break;
                    case ("creator"):
                        if (this.map_String__String_TypeAdapter == null) {
                            this.map_String__String_TypeAdapter = this.gson.getAdapter(new TypeToken<Map<String, String>>(){}).nullSafe();
                        }
                        builder.setCreator(this.map_String__String_TypeAdapter.read(reader));
                        break;
                    case ("creator_url"):
                        if (this.stringTypeAdapter == null) {
                            this.stringTypeAdapter = this.gson.getAdapter(String.class).nullSafe();
                        }
                        builder.setCreatorURL(this.stringTypeAdapter.read(reader));
                        break;
                    case ("description"):
                        if (this.stringTypeAdapter == null) {
                            this.stringTypeAdapter = this.gson.getAdapter(String.class).nullSafe();
                        }
                        builder.setDescription(this.stringTypeAdapter.read(reader));
                        break;
                    case ("image"):
                        if (this.imageTypeAdapter == null) {
                            this.imageTypeAdapter = this.gson.getAdapter(Image.class).nullSafe();
                        }
                        builder.setImage(this.imageTypeAdapter.read(reader));
                        break;
                    case ("name"):
                        if (this.stringTypeAdapter == null) {
                            this.stringTypeAdapter = this.gson.getAdapter(String.class).nullSafe();
                        }
                        builder.setName(this.stringTypeAdapter.read(reader));
                        break;
                    case ("url"):
                        if (this.stringTypeAdapter == null) {
                            this.stringTypeAdapter = this.gson.getAdapter(String.class).nullSafe();
                        }
                        builder.setUrl(this.stringTypeAdapter.read(reader));
                        break;
                    case ("_bits"):
                        bits = new boolean[10];
                        int i = 0;
                        reader.beginArray();
                        while (reader.hasNext() && i < 10) {
                            bits[i] = reader.nextBoolean();
                            i++;
                        }
                        reader.endArray();
                        break;
                    default:
                        reader.skipValue();
                }
            }
            reader.endObject();
            if (bits != null) {
                builder._bits = bits;
            }
            return builder.build();
        }
    }
}
