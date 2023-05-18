import {Injectable} from '@Angular/core';
import {HttpClient} from '@Angular/common/http';
import { Medico } from './Medico';
import {Observable} from 'rxjs';


@Injectable({
    providedIn: 'root'
})

export class MedicoService{
    private url:string = `http://localhost:8080/medicos`

    constructor(private http:HttpClient){ }

    listar():Observable<Medico[]>{
        return this.http.get<Medico[]>(this.url);
    }
}