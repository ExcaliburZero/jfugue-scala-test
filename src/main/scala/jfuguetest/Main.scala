package jfuguetest

import org.jfugue.realtime.RealtimePlayer
import org.jfugue.theory.Note
import javax.sound.midi.MidiSystem
import javax.sound.midi.MidiDevice

object Main {
  def main(args: Array[String]): Unit = {
    val devices: Array[MidiDevice.Info] = MidiSystem.getMidiDeviceInfo
    if (devices.length == 0) {
      println("No MIDI devices found")
    } else {
      for (dev <- devices) {
        println(dev)
      }
    }

    val player = new RealtimePlayer()
    player.play("C D E F G A B");
  }
}
