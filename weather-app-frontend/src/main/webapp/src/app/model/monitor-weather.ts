import { Weather } from './weather';
import { Wind } from './wind';
import { Main } from './main';

export class MonitorWeather {

    public id: number;
	public name: string;
	public weather: Weather;
	public wind: Wind;
	public main: Main;
	public dt: string;
}
