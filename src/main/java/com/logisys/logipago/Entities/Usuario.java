package com.logisys.logipago.Entities;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuario_id;

	@Column(nullable = false, unique = true, length = 50)
	private String usuario;

	@Column(nullable = false,length = 20)
	private String password;

	@Column(nullable = false,length = 100)
	private String nombres;

	@Column(nullable = false,length = 100)
	private String apellidos;

	private boolean esActivo;

	@Column(nullable = false)
	private Integer perfil;

	private boolean accesoDirecto;

	@Column(nullable = true)
	private LocalDateTime ultimoIngreso;

	@Column(nullable = true, length = 20)
	private String ultimoIp;

	@Column(nullable = true)
	private LocalDateTime anterior_ingreso;

	@Column(nullable = true,length = 50)
	private String color;

	private boolean esActivoLunes;
	private boolean esActivoMartes;
	private boolean esActivoMiercoles;
	private boolean esActivoJueves;
	private boolean esActivoViernes;
	private boolean esActivoSabado;
	private boolean esActivoDomingo;

	@Column(nullable = false)
	private LocalTime horaInicioLunes;
	@Column(nullable = false)
	private LocalTime horaFinLunes;

	@Column(nullable = false)
	private LocalTime horaInicioMartes;
	@Column(nullable = false)
	private LocalTime horaFinMartes;

	@Column(nullable = false)
	private LocalTime horaInicioMiercoles;
	@Column(nullable = false)
	private LocalTime horaFinMiercoles;

	@Column(nullable = false)
	private LocalTime horaInicioJueves;
	@Column(nullable = false)
	private LocalTime horaFinJueves;

	@Column(nullable = false)
	private LocalTime horaInicioViernes;
	@Column(nullable = false)
	private LocalTime horaFinViernes;

	@Column(nullable = false)
	private LocalTime horaInicioSabado;
	@Column(nullable = false)
	private LocalTime horaFinSabado;

	@Column(nullable = false)
	private LocalTime horaInicioDomingo;
	@Column(nullable = false)
	private LocalTime horaFinDomingo;

	public Usuario() {
		super();
	}

	public Usuario(Integer usuario_id, String usuario, String password, String nombres, String apellidos, boolean esActivo,
			Integer perfil, boolean accesoDirecto, LocalDateTime ultimoIngreso, String ultimoIp,
			LocalDateTime anterior_ingreso, String color, boolean esActivoLunes, boolean esActivoMartes,
			boolean esActivoMiercoles, boolean esActivoJueves, boolean esActivoViernes, boolean esActivoSabado,
			boolean esActivoDomingo, LocalTime horaInicioLunes, LocalTime horaFinLunes, LocalTime horaInicioMartes,
			LocalTime horaFinMartes, LocalTime horaInicioMiercoles, LocalTime horaFinMiercoles,
			LocalTime horaInicioJueves, LocalTime horaFinJueves, LocalTime horaInicioViernes, LocalTime horaFinViernes,
			LocalTime horaInicioSabado, LocalTime horaFinSabado, LocalTime horaInicioDomingo,
			LocalTime horaFinDomingo) {
		super();
		this.usuario_id = usuario_id;
		this.usuario = usuario;
		this.password = password;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.esActivo = esActivo;
		this.perfil = perfil;
		this.accesoDirecto = accesoDirecto;
		this.ultimoIngreso = ultimoIngreso;
		this.ultimoIp = ultimoIp;
		this.anterior_ingreso = anterior_ingreso;
		this.color = color;
		this.esActivoLunes = esActivoLunes;
		this.esActivoMartes = esActivoMartes;
		this.esActivoMiercoles = esActivoMiercoles;
		this.esActivoJueves = esActivoJueves;
		this.esActivoViernes = esActivoViernes;
		this.esActivoSabado = esActivoSabado;
		this.esActivoDomingo = esActivoDomingo;
		this.horaInicioLunes = horaInicioLunes;
		this.horaFinLunes = horaFinLunes;
		this.horaInicioMartes = horaInicioMartes;
		this.horaFinMartes = horaFinMartes;
		this.horaInicioMiercoles = horaInicioMiercoles;
		this.horaFinMiercoles = horaFinMiercoles;
		this.horaInicioJueves = horaInicioJueves;
		this.horaFinJueves = horaFinJueves;
		this.horaInicioViernes = horaInicioViernes;
		this.horaFinViernes = horaFinViernes;
		this.horaInicioSabado = horaInicioSabado;
		this.horaFinSabado = horaFinSabado;
		this.horaInicioDomingo = horaInicioDomingo;
		this.horaFinDomingo = horaFinDomingo;
	}

	public Integer getusuario_id() {
		return usuario_id;
	}

	public void setusuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombre) {
		this.nombres = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}

	public boolean isEsActivo() {
		return esActivo;
	}

	public void setEsActivo(boolean esActivo) {
		this.esActivo = esActivo;
	}

	public Integer getPerfil() {
		return perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	public boolean isAccesoDirecto() {
		return accesoDirecto;
	}

	public void setAccesoDirecto(boolean accesoDirecto) {
		this.accesoDirecto = accesoDirecto;
	}

	public LocalDateTime getUltimoIngreso() {
		return ultimoIngreso;
	}

	public void setUltimoIngreso(LocalDateTime ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}

	public String getUltimoIp() {
		return ultimoIp;
	}

	public void setUltimoIp(String ultimoIp) {
		this.ultimoIp = ultimoIp;
	}

	public LocalDateTime getAnterior_ingreso() {
		return anterior_ingreso;
	}

	public void setAnterior_ingreso(LocalDateTime anterior_ingreso) {
		this.anterior_ingreso = anterior_ingreso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEsActivoLunes() {
		return esActivoLunes;
	}

	public void setEsActivoLunes(boolean esActivoLunes) {
		this.esActivoLunes = esActivoLunes;
	}

	public boolean isesActivoMartes() {
		return esActivoMartes;
	}

	public void setesActivoMartes(boolean esActivoMartes) {
		this.esActivoMartes = esActivoMartes;
	}

	public boolean isEsActivoMiercoles() {
		return esActivoMiercoles;
	}

	public void setEsActivoMiercoles(boolean esActivoMiercoles) {
		this.esActivoMiercoles = esActivoMiercoles;
	}

	public boolean isEsActivoJueves() {
		return esActivoJueves;
	}

	public void setEsActivoJueves(boolean esActivoJueves) {
		this.esActivoJueves = esActivoJueves;
	}

	public boolean isEsActivoViernes() {
		return esActivoViernes;
	}

	public void setEsActivoViernes(boolean esActivoViernes) {
		this.esActivoViernes = esActivoViernes;
	}

	public boolean isEsActivoSabado() {
		return esActivoSabado;
	}

	public void setEsActivoSabado(boolean esActivoSabado) {
		this.esActivoSabado = esActivoSabado;
	}

	public boolean isEsActivoDomingo() {
		return esActivoDomingo;
	}

	public void setEsActivoDomingo(boolean esActivoDomingo) {
		this.esActivoDomingo = esActivoDomingo;
	}

	public LocalTime getHoraInicioLunes() {
		return horaInicioLunes;
	}

	public void setHoraInicioLunes(LocalTime horaInicioLunes) {
		this.horaInicioLunes = horaInicioLunes;
	}

	public LocalTime getHoraFinLunes() {
		return horaFinLunes;
	}

	public void setHoraFinLunes(LocalTime horaFinLunes) {
		this.horaFinLunes = horaFinLunes;
	}

	public LocalTime getHoraInicioMartes() {
		return horaInicioMartes;
	}

	public void setHoraInicioMartes(LocalTime horaInicioMartes) {
		this.horaInicioMartes = horaInicioMartes;
	}

	public LocalTime getHoraFinMartes() {
		return horaFinMartes;
	}

	public void setHoraFinMartes(LocalTime horaFinMartes) {
		this.horaFinMartes = horaFinMartes;
	}

	public LocalTime getHoraInicioMiercoles() {
		return horaInicioMiercoles;
	}

	public void setHoraInicioMiercoles(LocalTime horaInicioMiercoles) {
		this.horaInicioMiercoles = horaInicioMiercoles;
	}

	public LocalTime getHoraFinMiercoles() {
		return horaFinMiercoles;
	}

	public void setHoraFinMiercoles(LocalTime horaFinMiercoles) {
		this.horaFinMiercoles = horaFinMiercoles;
	}

	public LocalTime getHoraInicioJueves() {
		return horaInicioJueves;
	}

	public void setHoraInicioJueves(LocalTime horaInicioJueves) {
		this.horaInicioJueves = horaInicioJueves;
	}

	public LocalTime getHoraFinJueves() {
		return horaFinJueves;
	}

	public void setHoraFinJueves(LocalTime horaFinJueves) {
		this.horaFinJueves = horaFinJueves;
	}

	public LocalTime getHoraInicioViernes() {
		return horaInicioViernes;
	}

	public void setHoraInicioViernes(LocalTime horaInicioViernes) {
		this.horaInicioViernes = horaInicioViernes;
	}

	public LocalTime getHoraFinViernes() {
		return horaFinViernes;
	}

	public void setHoraFinViernes(LocalTime horaFinViernes) {
		this.horaFinViernes = horaFinViernes;
	}

	public LocalTime getHoraInicioSabado() {
		return horaInicioSabado;
	}

	public void setHoraInicioSabado(LocalTime horaInicioSabado) {
		this.horaInicioSabado = horaInicioSabado;
	}

	public LocalTime getHoraFinSabado() {
		return horaFinSabado;
	}

	public void setHoraFinSabado(LocalTime horaFinSabado) {
		this.horaFinSabado = horaFinSabado;
	}

	public LocalTime getHoraInicioDomingo() {
		return horaInicioDomingo;
	}

	public void setHoraInicioDomingo(LocalTime horaInicioDomingo) {
		this.horaInicioDomingo = horaInicioDomingo;
	}

	public LocalTime getHoraFinDomingo() {
		return horaFinDomingo;
	}

	public void setHoraFinDomingo(LocalTime horaFinDomingo) {
		this.horaFinDomingo = horaFinDomingo;
	}

}
