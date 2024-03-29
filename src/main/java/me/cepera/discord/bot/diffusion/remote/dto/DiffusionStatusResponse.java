package me.cepera.discord.bot.diffusion.remote.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DiffusionStatusResponse {

    private String uuid;

    private String status;

    private String errorDescription;

    private List<String> images = new ArrayList<>();

    private boolean censored;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public boolean isCensored() {
        return censored;
    }

    public void setCensored(boolean censored) {
        this.censored = censored;
    }

    @Override
    public int hashCode() {
        return Objects.hash(censored, errorDescription, images, status, uuid);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DiffusionStatusResponse other = (DiffusionStatusResponse) obj;
        return censored == other.censored && Objects.equals(errorDescription, other.errorDescription)
                && Objects.equals(images, other.images) && Objects.equals(status, other.status)
                && Objects.equals(uuid, other.uuid);
    }

    @Override
    public String toString() {
        return "DiffusionStatusResponse [uuid=" + uuid + ", status=" + status + ", errorDescription=" + errorDescription
                + ", images=" + images + ", censored=" + censored + "]";
    }

}
