import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Fan } from './fan';

@Injectable({
  providedIn: 'root'
})
export class FanService {

  private baseURL= "http://localhost:8088/getFanList";

  constructor(private _http:HttpClient) { }

  fetchFanListFromRemote(): Observable<Fan[]> {
    return this._http.get<Fan[]>(`${this.baseURL}`);
  }

  addFantoRemote(fan:Fan): Observable<Object>{
    return this._http.post("http://localhost:8088/addFan", fan);
  }

  getFanById(id: number): Observable<Fan>{
    return this._http.get<Fan>(`${this.baseURL}/${id}`);
  }
  
 
  updateFantoRemote(id: number, fan: Fan): Observable<Object>{
    return this._http.put(`${"http://localhost:8088/updateFan"}/${id}`, fan);
  }

  deleteFanFromRemote(id: number): Observable<Object>{
    return this._http.delete(`${"http://localhost:8088/deleteFan"}/${id}`);
  }
}
