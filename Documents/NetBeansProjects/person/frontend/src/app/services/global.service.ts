import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, catchError } from 'rxjs/operators';
import { CommonHttpService } from './common-http.service';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class GlobalService extends CommonHttpService {

  constructor(public http: HttpClient) {
    super()
  }
  public submitData(name, card_id, phone) {
    return this.http.post(environment.baseUrl + "add-new", {name, card_id, phone}).pipe(
      map((Response) => { return Response }),
      catchError(this.handleError)
    );
  }
  public getData() {
    return this.http.get(environment.baseUrl + "all").pipe(
      map((Response) => { return Response }),
      catchError(this.handleError)
    );
  }
}
