package es1;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tipi.TipoEvento;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class PartitaDiCalcio extends Evento {

	@Column(name = "casa")
	private String squadraDiCasa;
	@Column(name = "ospite")
	private String squadraOspite;
	@Column(name = "vincente")
	private String squadraVincente;
	// [null se pareggio]
	@Column(name = "golcasa")
	private int numeroGolSquadraCasa;
	@Column(name = "golospite")
	private int numeroGolSquadraOspite;

	public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, int numeroGolSquadraCasa, int numeroGolSquadraOspite) {
		super(titolo, dataEvento, descrizione,tipoEvento, numeroMassimoPartecipanti, location);
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.numeroGolSquadraCasa = numeroGolSquadraCasa;
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
		}
}
