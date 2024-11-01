/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author PC
 */
public class cEvents {
    
    private long idEvent;
    private String eventName;
    private LocalDateTime eventCreated;
    private String dateEvent;
    private LocalTime timeEvent;
    private String status;
    private long idLocation;
    private long idUser;
    private String tipoEvent;

    public long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(long idEvent) {
        this.idEvent = idEvent;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getEventCreated() {
        return eventCreated;
    }

    public void setEventCreated(LocalDateTime eventCreated) {
        this.eventCreated = eventCreated;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public LocalTime getTimEvent() {
        return timeEvent;
    }

    public void setTimEvent(LocalTime timeEvent) {
        this.timeEvent = timeEvent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(long idLocation) {
        this.idLocation = idLocation;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public cEvents() {
    }

    public String getTipoEvent() {
        return tipoEvent;
    }

    public void setTipoEvent(String tipoEvent) {
        this.tipoEvent = tipoEvent;
    }
    
    

    @Override
    public String toString() {
        return "cEvents{" + "idEvent=" + idEvent + ", eventName=" + eventName + ", eventCreated=" + eventCreated + ", dateEvent=" + dateEvent + ", timeEvent=" + timeEvent + ", status=" + status + ", idLocation=" + idLocation + ", idUser=" + idUser + '}';
    }
    
    public String toJSON() {
    return "{"
            + "\"eventName\": \"" + eventName + "\", "
            + "\"eventCreated\": \"" + eventCreated + "\", "
            + "\"dateEvent\": \"" + dateEvent + "\", "
            + "\"timeEvent\": \"" + timeEvent + "\", "
            + "\"status\": \"" + status + "\", "
            + "\"tipoEvent\": \"" + tipoEvent + "\", "
            + "\"idLocation\": " + idLocation + ", "
            + "\"idUser\": " + idUser
            + "}";
    }
}
