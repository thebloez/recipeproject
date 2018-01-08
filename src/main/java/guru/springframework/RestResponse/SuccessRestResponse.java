package guru.springframework.RestResponse;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

/**
 * Created by thebloez on 09/01/18.
 */
public class SuccessRestResponse<T> {

    String status = String.valueOf(HttpStatus.OK);
    Optional<T> data;
    List<T> listData;

    public SuccessRestResponse(Optional<T> data) {
        this.data = data;
    }

    public SuccessRestResponse(List<T> listData) {
        this.listData = listData;
    }

    public List<T> getListData() {
        return listData;
    }

    public void setListData(List<T> listData) {
        this.listData = listData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Optional<T> getData() {
        return data;
    }

    public void setData(Optional<T> data) {
        this.data = data;
    }
}
