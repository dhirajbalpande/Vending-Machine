import pcapy

# Get the list of available network interfaces
interfaces = pcapy.findalldevs()

# Print the list of available interfaces
print("Available Interfaces: ", interfaces)

# Select the interface to capture packets from
interface = input("Enter the interface to capture packets from: ")

# Open the selected interface in promiscuous mode with a max packet size of 65535 bytes
capture = pcapy.open_live(interface, 65535, 1, 0)

# Start capturing packets
while True:
    # Read a single packet from the capture buffer
    (header, packet) = capture.next()

    # Print the packet details
    print("Packet: ", packet)
