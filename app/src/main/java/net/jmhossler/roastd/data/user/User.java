package net.jmhossler.roastd.data.user;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.HashMap;
import java.util.Map;

// Description: Data object for a user. Contains unique user id, email, name, photoURL,
//   and favoriteUuids
public class User {
  private String uuid;
  private String email;
  private String name;
  private String photoURL;
  private Map<String, Boolean> favoriteUUIDs;
  private Map<String, Boolean> recommendationUUIDs;

  public User() {
    // Default constructor required for calls to DataSnapshot.getValue(User.class)
  }

  public User(String uuid, String email, String name, String photoURL) {
    setUuid(uuid);
    setEmail(email);
    setName(name);
    setPhotoURL(photoURL);
    setFavoriteUUIDs(new HashMap<>());
    setRecommendationUUIDs(new HashMap<>());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (obj == null) {
      return false;
    } else if (obj instanceof User) {
      return getUuid().equals(((User) obj).getUuid());
    }
    return false;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(@NonNull String uuid) {
    this.uuid = uuid;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(@NonNull String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(@NonNull String name) {
    this.name = name;
  }

  public String getPhotoURL() {
    return photoURL;
  }

  public void setPhotoURL(@Nullable String photoURL) {
    this.photoURL = photoURL;
  }

  public Map getFavoriteUUIDs() {
    return favoriteUUIDs;
  }

  public void setFavoriteUUIDs(@NonNull Map<String, Boolean> favoriteUUIDs) {
    this.favoriteUUIDs = favoriteUUIDs;
  }

  public Map getRecommendationUUIDs() { return recommendationUUIDs; }

  public void setRecommendationUUIDs(Map<String, Boolean> recommendationUUIDs) {
    this.recommendationUUIDs = recommendationUUIDs;
  }

  public void addFavoriteUUID(@NonNull String favorite) {
    favoriteUUIDs.put(favorite, true);
  }

  public void removeFavoriteUUID(@NonNull String favorite) {
    favoriteUUIDs.remove(favorite);
  }
}
