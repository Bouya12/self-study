using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Ball : MonoBehaviour {
    void Start() {
        Vector3 force = new Vector3(10, 0, 10);
        Rigidbody rbody = this.GetComponent<Rigidbody>();
        rbody.AddForce(force, ForceMode.VelocityChange);
    }
}
