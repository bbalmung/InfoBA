public class repositrio
{
	public Collection<PuntosDeInteres> puntosDeInteres;
	public Collection<Administrador> administradores;
	public Estadisticas estadisticas;
	
	public agregarPuntoDeInteres(PuntoDeInteres poi)
	{
		this.puntosDeInteres().add(poi);
	}
	
	public Collection<PuntosDeInteres> buscarPuntoDeInteres(String texto)
	{
		Collection<PuntosDeInteres> poisADevolver;
		for (PuntoDeInteres poi : this.puntosDeInteres())
		{
			if poi.buscarTexto(texto)
			{
				poisADevolver.add(poi);
			}
		}
	}
}